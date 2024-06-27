package com.example.iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ilya", "Balejko", 10000,
                new Car("Opel", "Blue"));

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream("test.bin"))) {

            outputStream.writeObject(employee);
            System.out.println("Good!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
