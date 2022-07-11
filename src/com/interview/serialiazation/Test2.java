package com.interview.serialiazation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
public static void main(String[] args) {
	
	File file = new File("C:\\Users\\akkit/abc.txt");
	try {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream obj = new ObjectInputStream(fis);
		Employee e1 = (Employee)obj.readObject();
		Student s1 = (Student)obj.readObject();
		
		System.out.println("File read successfully");
		System.out.println(s1);
		System.out.println(e1);
		obj.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
