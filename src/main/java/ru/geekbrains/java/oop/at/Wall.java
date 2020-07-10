package ru.geekbrains.java.oop.at;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    protected boolean moving(Human human) {
        System.out.println(super.getName() + " высота: " + this.height);

        human.jump();

        if (getHeight() <= human.getJumpHeight()) {
            System.out.println("Перепрыгнул");

            return true;
        } else {
            System.out.println("Не перепрыгнул");

            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println(super.getName() + " высота: " + this.height);

        robot.jump();

        if (getHeight() <= robot.getJumpHeight()) {
            System.out.println("Перепрыгнул");

            return true;
        } else {
            System.out.println("Не перепрыгнул");

            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println(super.getName() + " высота: " + this.height);

        cat.jump();

        if (getHeight() <= cat.getJumpHeight()) {
            System.out.println("Перепрыгнул");

            return true;
        } else {
            System.out.println("Не перепрыгнул");

            return false;
        }
    }
}
