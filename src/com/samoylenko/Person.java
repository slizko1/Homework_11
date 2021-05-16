//1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
//        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
//        Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
//        Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
//        Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
//        не было человека весом 3 кг и ростом 180 итд.

package com.samoylenko;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

