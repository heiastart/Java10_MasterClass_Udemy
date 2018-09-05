package com.oyvindsorlie;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("src/MyFile.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("SOla er god, sola æ toppen :-) \nNy linje må til!!!!");
            fileWriter.close();

            // Then we read it back to the console...
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
