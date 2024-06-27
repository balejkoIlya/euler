package com.example.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerTest2 {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("test.bin")))
        {
            employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
