package ru.geekbrains.java.oop.at;

import java.util.Random;

public class Start {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);
        actions[0] = new Human("Человек", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[1] = new Robot("Робот", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[2] = new Cat("Кот", distance, height);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Беговая дорожка,", distance);
            } else {
                barriers[i] = new Wall("Стена,", distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {


                if (Human.class == actions[i].getClass()) {
                    result = barriers[j].moving((Human) actions[i]);
                }

                if (Robot.class == actions[i].getClass()) {
                    result = barriers[j].moving((Robot) actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = barriers[j].moving((Cat) actions[i]);
                }

                if (!result) {
                    break;
                }
            }

        }
    }
}
