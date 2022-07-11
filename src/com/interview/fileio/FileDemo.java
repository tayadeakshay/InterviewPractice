package com.interview.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\akkit/myDirectory");
        file.mkdir();

        System.out.println(Arrays.toString(file.list()));

        String filePath = file.getAbsolutePath();
        System.out.println(file.getPath());

        System.out.println(filePath);

        String filename = "/myFile1.txt";

        File file1 = new File(filePath+filename);
        System.out.println("file exist ?? >>>>>>"+file1.exists());
        file1.createNewFile();
        System.out.println("file created successfully!!!");

        //System.out.println(file1.delete());

        System.out.println(file1.length());

        //file1.delete();
        System.out.println(file1.isFile());

        System.out.println(file.list().length);

    }

}
