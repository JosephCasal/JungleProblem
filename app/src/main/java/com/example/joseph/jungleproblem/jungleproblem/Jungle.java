package com.example.joseph.jungleproblem.jungleproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by joseph on 10/19/17.
 */

public class Jungle {

    List<Food> foods;
    List<Animal> animals;
    int tigerCount, snakeCount, monkeyCount;

    public Jungle() {
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
        tigerCount = 0;
        snakeCount = 0;
        monkeyCount = 0;
        foods.add(new Food("meat"));
        foods.add(new Food("fish"));
        foods.add(new Food("bugs"));
        foods.add(new Food("grain"));
    }

    public void soundOff(){
        for (Animal a : animals){
            a.makeSound();
            a.reportEnergy();
        }
    }

    public void addAnimal(String animal){

        switch (animal){

            case "Tiger":

                tigerCount++;
                for (Animal a: animals)
                    if(a instanceof Tiger)
                        a.numberOfKind++;
                animals.add(new Tiger(tigerCount));

                break;

            case "Snake":

                snakeCount++;
                for (Animal a: animals)
                    if(a instanceof Snake)
                        a.numberOfKind++;
                animals.add(new Snake(snakeCount));

                break;

            case "Monkey":

                monkeyCount++;
                for (Animal a: animals)
                    if(a instanceof Monkey)
                        a.numberOfKind++;
                animals.add(new Monkey(monkeyCount));

                break;

            default:

                System.out.println("can only add tigers, snakes, and monkeys");

                break;

        }

    }

    public void randomActions(){

        Random r = new Random();
        int action;

        for (Animal a : animals){
            if(a instanceof Monkey)
                action = r.nextInt(4);
            else
                action = r.nextInt(3);
            switch (action){
                case 0:
                    a.eat(foods.get(r.nextInt(4)));
                    break;
                case 1:
                    a.sleep();
                    break;
                case 2:
                    a.makeSound();
                    break;
                case 3:
                    ((Monkey)a).play();
                    break;
            }
        }

    }

}
