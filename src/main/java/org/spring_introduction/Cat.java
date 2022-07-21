package org.spring_introduction;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Mow-mow");
    }

    public Cat() {
        System.out.println("Cat bean is created!");
    }
}