package ru.geekbrains.example.checkexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        File file;
        Scanner scanner;
        try {
            file = new File("src/test/resources/txt.txt");
            System.out.println("блок try до Exception");
            scanner = new Scanner(file);
            System.out.println("блок try после Exception");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("блок finally");
        }

        System.out.println("Программа выполнилась до конца!");

        throw new NullPointerException("!!!!!");
    }


    public static NullPointerException checkFile() throws FileNotFoundException {
        return new NullPointerException("!!!!!");
    }
}
