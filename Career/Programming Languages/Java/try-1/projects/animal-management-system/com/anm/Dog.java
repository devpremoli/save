package com.anm;

public class Dog extends Animal {
    public Dog (String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}