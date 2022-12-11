package com.epam.OOP;

public class Dog extends Animal{
    public static void main(String[] args) {
        new Dog().getDescription();
    }

    public Dog() {
        super("brown", 4, true);
    }

}
