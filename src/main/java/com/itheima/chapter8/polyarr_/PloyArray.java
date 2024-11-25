package com.itheima.chapter8.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        persons[0] = new Person("Tom", 18);
        persons[1] = new Student("小马", 30, 95);
        persons[2] = new Student("小叶", 25, 88);
        persons[3] = new Teacher("铁梅", 35, 20000);
        persons[4] = new Teacher("万奇", 45, 200000);

        for (Person person : persons) {
            System.out.println(person.say());
            if (person instanceof Student) {
                ((Student) person).study();
            } else if (person instanceof Teacher) {
                ((Teacher) person).teach();
            }
        }
    }
}

