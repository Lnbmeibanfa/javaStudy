package com.itheima.chapter8.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Tom", 18, "电工");
        persons[1] = new Person("Wang", 16, "作家");
        persons[2] = new Person("Mei", 20, "歌手");
        sortPersonByAge(persons);
        for (Person person : persons) {
            System.out.println(person.age);
        }
    }
    public static void sortPersonByAge(Person[] persons) {
        for (int i = 0;i < persons.length;i++) {
            for (int j = i+1;j < persons.length;j++) {
                if (persons[i].age > persons[j].age) {
                    Person temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }
}

