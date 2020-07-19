package ru.geekbrains.java.oop.at;

public class Treadmill implements Barrier {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void check(Actions actions) {
        actions.run();
        actions.setSuccess(actions.getRunDistance() >= length);
        if (actions.getSuccess()) {
            System.out.println(actions.getName() + " выполнил испытание, пробежав дорожку длиной: " + length);
        } else {
            System.out.println(actions.getName() + " не пробежал дорожку длиной: " + length);
        }
    }
}
