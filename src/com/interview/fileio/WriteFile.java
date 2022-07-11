package com.interview.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        File filePath = new File("C:\\Users\\akkit\\myDirectory/myFile.txt");

        String inputDataToWrite = "All ok!!";
        

        FileWriter fileWriter = new FileWriter(filePath);
        try {
            fileWriter.append(inputDataToWrite);
        } catch (IOException e) {
            System.out.println("Unable to write data into file!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Data written to file successfully!!");


    }
}
