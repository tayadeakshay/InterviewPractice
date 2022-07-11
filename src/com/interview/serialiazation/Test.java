package com.interview.serialiazation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(10,"Ram");
		Student s1 = new Student(20,"Sham");
		
		File file = new File("C:\\Users\\akkit/abc.txt");
		ObjectOutputStream obj = null;
		try {
			file.createNewFile();
			FileOutputStream fileWriter = new FileOutputStream(file);
			obj = new ObjectOutputStream(fileWriter);
			obj.writeObject(e1);
			obj.writeObject(s1);
			
			System.out.println("New File Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				obj.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
