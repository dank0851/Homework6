package org.example;

public class Person {
    public static void main(String[] args) {

    }

    private String fullName;
    private String position;
    private String eMail;
    private String telephoneNumber;
    private int salary;
    private int age;

    public Person(String fullName,
                  String position,
                  String eMail,
                  String telephoneNumber,
                  int salary,
                  int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + fullName + " | Position: " + position + " | email: " + eMail + " | Phone: " + telephoneNumber + " | Salary: " + salary + " | Age: " + age);
    }
}


