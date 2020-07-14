package ru.geekbrains.java.oop.at;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void check(Actions actions) {
        actions.jump();
        actions.setSuccess(actions.getJumpHeight() >= height);
        if (actions.getSuccess()) {
            System.out.println(actions.getName() + " выполнил испытание, перепрыгнув стену высотой: " + height);
        } else {
            System.out.println(actions.getName() + " не перепрыгнул стену высотой: " + height);
        }
    }
}
