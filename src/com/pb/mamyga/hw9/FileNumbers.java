package com.pb.mamyga.hw9;

import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args){
        createNumbersFile();
        createOddNumbersFile();
    }

    static void createNumbersFile(){
        try {
            Random random = new Random();

            Path path = Paths.get("numbers.txt");
            if(!Files.exists(path)){
                Files.createFile(path);
            }

            BufferedWriter writer = Files.newBufferedWriter(path);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.write(random.nextInt(100) + " ");
                }
                writer.newLine();
            }

            writer.flush();
            writer.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    static void createOddNumbersFile(){
        try {
            Path path = Paths.get("numbers.txt");
            if(!Files.exists(path)){
                return;
            }

            String line, tmp = "";
            int num;

            BufferedReader reader = Files.newBufferedReader(path);
            while((line = reader.readLine()) != null) {
                for(String s: line.split(" ")){
                    num = Integer.parseInt(s);
                    tmp += (num % 2 == 0 ? 0 : num) + " ";
                }

                tmp += "\n";
            }
            reader.close();

            path = Paths.get("odd-numbers.txt");
            if(!Files.exists(path)){
                Files.createFile(path);
            }

            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write(tmp);
            writer.flush();
            writer.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
