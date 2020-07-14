package ru.geekbrains.java.oop.at;

public class Start {
    public static void main(String[] args) {
        Actions catMatroskin = new Cat("Матроскин", 9, 10);
        Actions catBarsik = new Cat("Барсик", 8, 15);

        Actions humanFedor = new Human("Дядя Фёдор", 20, 7);
        Actions humanPechkin = new Human("Печкин", 15, 5);

        Actions robotArnold = new Robot("Арнольд", 15, 11);
        Actions robotVerter = new Robot("Вертер", 25, 9);

        Actions[] participants = {catMatroskin, catBarsik, humanPechkin, humanFedor, robotArnold, robotVerter};


        Barrier wall = new Wall(10);
        Barrier wall1 = new Wall(11);


        Barrier treadmill = new Treadmill(10);
        Barrier treadmill1 = new Treadmill(15);


        Barrier[] barriers = {wall, wall1, treadmill, treadmill1};


        System.out.println("На старт! Внимание! Марш!");
        for (int i = 0; i < barriers.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            for (Actions participant : participants) {
                if (participant.getSuccess()) {
                    System.out.println("*******************************************************");
                    barriers[i].check(participant);
                }

            }
        }
    }
}
