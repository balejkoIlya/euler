package com.example.iotest;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("test.txt"));) {
            int line;
            while((line=reader.read())!=-1){
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
