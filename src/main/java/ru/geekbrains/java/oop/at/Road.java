package ru.geekbrains.java.oop.at;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    protected boolean moving(Human human) {
        System.out.println(super.getName() + " длина: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Пробежал!");

            return true;
        } else {
            System.out.println("Не пробежал!");

            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println(super.getName() + " длина: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println("Пробежал!");

            return true;
        } else {
            System.out.println("Не пробежал!");

            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println(super.getName() + " длина: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Пробежал!");

            return true;
        } else {
            System.out.println("Не пробежал!");

            return false;
        }
    }
}
