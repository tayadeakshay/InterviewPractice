package com.interview.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent 
{
	int i;

	public Parent(int i) {
		super();
		this.i = i;
	}

	public Parent() {
		super();
		System.out.println("no arg constructor executed!!");
	}
	
	
}

class Child extends Parent implements Serializable
{
	public Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	int j = 20;
}

public class InheritanceInSerialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Child Child = new Child(50);
		
		File file = new File("inheritanceInSerialization2.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Child);
		oos.close();
		fos.close();
		System.out.println("Object serialized!!!");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child deserializedChild = (Child) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(deserializedChild.i);
		System.out.println(deserializedChild.j);
		

	}	
}
