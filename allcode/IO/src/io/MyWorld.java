package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class House implements Serializable{}
class Animal implements Serializable{
	private String name;
	private House perferredHouse;
	Animal(String mn ,House h)
	{
		name = mn ;
		perferredHouse = h;
	}
	public String toString()
	{
		return name + "[" + super.toString() + "]," + perferredHouse + "\n";
	}

}

public class MyWorld   {

	public static void main(String[] args) throws Exception{
		House house = new House();
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("dog", house));
		animals.add(new Animal("hamster" , house));
		animals.add(new Animal("Cat", house));
		
		System.out.println("animals :" + animals);
		
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		ObjectOutputStream o1 = new ObjectOutputStream(buff);
		o1.writeObject(animals);
		o1.writeObject(animals);
		
		ByteArrayOutputStream buff2 = new ByteArrayOutputStream();
		ObjectOutputStream o2 = new ObjectOutputStream(buff2);
		
		o2.writeObject(animals);
		
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buff.toByteArray()));
		
		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buff2.toByteArray()));
		
		List animals1 = (List)in.readObject(),
		     animals2 =(List)in.readObject(),
		     animals3 = (List)in2.readObject();
		
		System.out.println("animals1" + animals1);
		System.out.println("animals2 " + animals2);
		System.out.println("animals3 " + animals3);
		     
		
		
		
	}
}
