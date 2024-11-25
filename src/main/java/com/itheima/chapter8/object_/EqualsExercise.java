package com.itheima.chapter8.object_;


public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("张三",  18, '男');
        Person person2 = new Person("张三", 11, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1);
        person1 = null;
        System.gc();
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof Person) {
            Person person = (Person) object;
            return this.name.equals(person.name) && this.age == person.getAge() && this.gender == person.getGender();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( name + "进程释放了...");
    }
}
