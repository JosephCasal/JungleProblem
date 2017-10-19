package com.example.joseph.jungleproblem.jungleproblem;

/**
 * Created by joseph on 10/19/17.
 */

public abstract class Animal {

    int energy;
    int numberOfKind;
    String sound;

    public Animal(String sound, int numberOfKind) {
        this.energy = 0;
        this.numberOfKind = numberOfKind;
        this.sound = sound;
    }

    public void eat(Food food){
        energy += 5;
    }

    public void sleep(){
        energy += 10;
    }

    public void makeSound(){
        energy -=3;
        System.out.println(sound);
    }

    public void reportEnergy(){
        System.out.println(energy + " energy left");
    }

}
