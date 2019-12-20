package com.volkodav4ik;

import java.util.Arrays;
import java.util.Calendar;

import static java.lang.Integer.parseInt;

public class Person {

    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;

    public Person(String lastName, String firstName, String middleName, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Person(String fullName) {
        String[] str = fullName.split("\\s");
        this.lastName = str[0];
        this.firstName = str[1];
        this.middleName = str[2];
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName(Person person) {
        return person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName();
    }

    public String getShortName(Person person) {
        return person.getLastName() + " " + person.getFirstName().substring(0, 1) + ". "
                + person.getMiddleName().substring(0, 1) + ".";
    }

    public String getAge(Person person) {
        Calendar date = Calendar.getInstance();
        String[] dateOfBirth = getDateOfBirth().split("\\.");
        int age = date.get(Calendar.YEAR) - parseInt(dateOfBirth[2]);
        if ((date.get(Calendar.MONTH) + 1) < parseInt(dateOfBirth[1])) {
            age--;
        } else {
            if ((date.get(Calendar.MONTH) + 1) == parseInt(dateOfBirth[1])
                    && date.get(Calendar.DAY_OF_MONTH) < parseInt(dateOfBirth[0])) {
                age--;
            }
        }
        return "Количество полных лет: " + age;
    }

    public String toString() {
        return "Person{" +
                "Фамилия  " + lastName +
                ", Имя " + firstName +
                ", Отчество " + middleName +
                ", дата рождения = " + dateOfBirth +
                '}';
    }

}
