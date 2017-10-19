package com.example.joseph.jungleproblem.jungleproblem;

/**
 * Created by joseph on 10/19/17.
 */

public class Tester {

    public static void main(String[] args) {

        Jungle jungle = new Jungle();

        jungle.addAnimal("Tiger");
        jungle.addAnimal("Tiger");
        jungle.addAnimal("Monkey");
        jungle.addAnimal("Snake");
        jungle.addAnimal("Snake");
        jungle.addAnimal("Monkey");

        jungle.soundOff();

        System.out.println();

        jungle.randomActions();

    }

}
