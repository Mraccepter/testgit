package Compute;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent;
public class HeapOOM {

	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true)
		{
			list.add(new OOMObject());
		}
	}
}
