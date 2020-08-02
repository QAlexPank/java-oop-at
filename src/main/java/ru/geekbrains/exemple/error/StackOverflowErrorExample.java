package ru.geekbrains.exemple.error;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        example();
    }

    public static int number = 0;

    public static int example() {
        System.out.println(number++);
        return example();
    }
}

