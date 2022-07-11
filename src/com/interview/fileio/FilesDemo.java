package com.interview.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesDemo {

	public static void main(String[] args) {
	
		Path path = Paths.get("C:\\Users\\akkit/file.txt");
		try {
//			Path createdFilePath = Files.createFile(path);
//			System.out.println("File Created at Path : "+createdFilePath);
			
			List<String> lines = Files.readAllLines(path);
			
			System.out.println(lines);
			
			int totalLines =lines.size();
			
			System.out.println(totalLines);
			
			String[] words = null;
			List<String> list = new ArrayList();
			for(String line : lines)
			{
				words = line.split(" ");
				list.addAll(Arrays.asList(words));
			}
			System.out.println(list);
			System.out.println(list.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		  		 
	}

}
