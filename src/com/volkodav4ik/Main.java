package com.volkodav4ik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Иванов Иван Иванович");
        System.out.println(Arrays.toString(new Person[]{ivan}));

        Person alex = new Person("Александров", "Александр", "Александрович");
        System.out.println(alex.getFullName(alex));

        Person igor = new Person("Игорев", "Игорь", "Игоревич");
        System.out.println(igor.getShortName(igor));

        Person vasya = new Person("Васильев", "Василий", "Васильевч", "21.12.1990");
        System.out.println(vasya.getAge(vasya));
    }
}
