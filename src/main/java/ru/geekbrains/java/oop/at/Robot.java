package ru.geekbrains.java.oop.at;

public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean success = true;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    public void run() {
        System.out.println(this.name + " может пробежать: " + this.getRunDistance());
    }

    public void jump() {
        System.out.println(this.name + " может прыгнуть: " + this.getJumpHeight());
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
