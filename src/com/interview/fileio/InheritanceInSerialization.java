package com.interview.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class P implements Serializable
{
	int i = 10;
}

class Q extends P 
{
	int j = 20;
}

public class InheritanceInSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		A a = new A();
		
		Q q = new Q();
		
		File file = new File("inheritanceInSerialization.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(q);
		oos.close();
		fos.close();
		System.out.println("Object serialized!!!");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Q deserializedQ = (Q) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(q.i);
		System.out.println(q.j);
		

	}	
}
