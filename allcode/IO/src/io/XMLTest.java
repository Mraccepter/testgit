package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

public class XMLTest {
	private String first,last;
	
	public XMLTest(String first ,String last) {
		this.first = first;
		this.last = last;
	}
	public Element getXML()
	{
		Element person = new Element("person");
		Element firstName = new Element("first");
		firstName.appendChild(first);
		Element lastName = new Element("last");
		lastName.appendChild(last);
		
		person.appendChild(firstName);
		person.appendChild(lastName);
		
		return person;
		
	}
	public XMLTest(Element person) {
		first = person.getFirstChildElement("first").getValue();
		last = person.getFirstChildElement("last").getValue();
		
		
	}
public String toString()
{
	return first + " " + last;
}
public static void format(OutputStream os , Document doc) throws IOException
{
	Serializer serializer = new Serializer(os,"UTF-8");
	serializer.setIndent(4);
	serializer.setMaxLength(60);
	serializer.write(doc);
	serializer.flush();
}
public static void main(String[] args) throws IOException {
	List<XMLTest> people = Arrays.asList(new XMLTest("ab","cd"),new XMLTest("EF","GH"));
	System.out.println(people);
	Element root = new Element("people");
	for(XMLTest p : people)
	{
		root.appendChild(p.getXML());
		
	}
	Document doc = new Document(root);
	
	format(System.out,doc);
	format(new BufferedOutputStream(new FileOutputStream("people.xml")), doc);
}
}
