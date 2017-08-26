package com.zoo.animals;

public class Tiger extends Animal {

    public Tiger() {
        this("srt", 3);
        //  super(70);
        //   super();
        System.out.println("Hello from Tiger() constructor");

    }

    public Tiger(String name, Integer hungerLevel) {

        super(hungerLevel);
        setName(name);
        System.out.println("Hello from Tiger(name, hungerLevel) constructor");

    }

    public Tiger(String name) {
        super();
        setName(name);

    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm Tiger - moving veeeery fast!");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Wrrrrrrrrrrr !!!");
    }
}
