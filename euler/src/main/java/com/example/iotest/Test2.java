package com.example.iotest;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try (BufferedInputStream reader =new BufferedInputStream(new FileInputStream("qwe.png"));
             BufferedOutputStream writer=new BufferedOutputStream(new FileOutputStream("hiq.jpg"))
        )
        {
            int i;
            while((i=reader.read())!=-1){
                writer.write(i);
            }
            System.out.println("Completed!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
