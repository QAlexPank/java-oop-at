package ru.geekbrains.java.oop.at;

public interface Actions {

     String getName();

     int getRunDistance();

     int getJumpHeight();

     boolean getSuccess();

     void setSuccess(boolean success);

     void run();

     void jump();
}
