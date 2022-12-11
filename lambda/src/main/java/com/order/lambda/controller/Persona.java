package com.order.lambda.controller;

public class Persona implements Comparable<Persona>{
    private String lastName;
    private String name;
    private int age;

    public Persona(String lastName, String name, int age) {
        super();
        this.lastName = lastName;
        this.name = name;
        this.age = age;
    }

    public String getLastName() {
       return lastName;   }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + lastName + '\'' +
                ", nombre='" + name + '\'' +
                ", edad=" + age +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        Persona a = (Persona) o;
        return this.getName().compareTo(a.getName());
    }

}
