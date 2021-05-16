package com.samoylenko;

import java.util.List;
import java.util.Random;

public class FillingOutTheList {
    public static final Random RANDOM = new Random();

    public static void fill(List<Person> listOfPeople) {
        for (int i = 0; i < 99; i++) {
            listOfPeople.add(new Person(chooseName(), chooseSurname(), setAge(), setWeight(), setHeight()));
        }
    }

    private static String chooseName() {
        String[] name = {"Basil", "Godfrey", "Dean", "Matthew", "Bruno", "Brian", "Benjamin", "Edward", "Jesse"};
        String selectedName = name[RANDOM.nextInt(9)];
        return selectedName;
    }

    private static String chooseSurname() {
        String[] surname = {"Hampton", "Floyd", "Dean", "Gaines", "Goodwin", "Phillips ", "Wilcox", "Bradley", "Nicholson"};
        String selectedSurname = surname[RANDOM.nextInt(9)];
        return selectedSurname;
    }

    private static int setAge() {
        int age = RANDOM.nextInt(70) + 18;
        return age;
    }

    private static int setHeight() {
        int height = RANDOM.nextInt(50) + 150;
        return height;
    }

    private static int setWeight() {
        int weight = RANDOM.nextInt(60) + 40;
        return weight;
    }
}

