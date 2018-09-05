package com.oyvindsorlie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInputs {

    public static void main(String[] args) throws IOException {


        File file = new File("src/test.txt");
        //System.out.println(file.length());
        try (FileInputStream fileInputStream = new FileInputStream(file)){

            System.out.println("Total size in bytes is: " + fileInputStream.available());
            int content;

            // Then we use fileInputStream.read() to actually READ THE FILE!!
            // HOWEVER -> BETTER to use FILEREADER + BUFFEREDREADER classes to do this, as in the WriteToFile.java class/file...
            while ( (content = fileInputStream.read()) != -1){
                // Convert content to char and display it
                System.out.print((char) content);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        /*
        byte data[] = new byte[10];

        System.out.println("Enter some characters: ");
        System.in.read(data);
        System.out.println("You entered: ");

        for (int i=0; i<data.length; i++){
            System.out.print((char) data[i]);
        }
         */


    }
}
