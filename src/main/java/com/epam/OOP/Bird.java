package com.epam.OOP;

public class Bird extends Animal{
    public static void main(String[] args) {
        new Bird().getDescription();
    }

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
