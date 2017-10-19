package com.example.joseph.jungleproblem.jungleproblem;

/**
 * Created by joseph on 10/19/17.
 */

public class Tiger extends Animal{


    public Tiger(int numberOfKind) {
        super("Tiger Sound", numberOfKind);
    }

    @Override
    public void sleep() {
        this.energy += 5;
    }

    @Override
    public void eat(Food food) {
        if(!food.getType().equals("grain"))
            super.eat(food);
        else
            System.out.println("Tigers cant eat grain!");
    }
}
