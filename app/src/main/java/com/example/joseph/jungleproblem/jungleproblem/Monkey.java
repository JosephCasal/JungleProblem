package com.example.joseph.jungleproblem.jungleproblem;

/**
 * Created by joseph on 10/19/17.
 */

public class Monkey extends Animal {

    public Monkey(int numberOfKind) {
        super("Monkey Sound", numberOfKind);
    }

    @Override
    public void eat(Food food) {
        this.energy += 2;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        this.energy -= 1;
    }

    public void play(){
        if(this.energy >= 8){
            System.out.println("Oooo Oooo Oooo");
            this.energy -=8;
        }else{
            System.out.println("Monkey is too tired");
        }
    }

}
