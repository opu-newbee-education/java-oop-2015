package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 29.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        GameObject[][] options = {
            {new Rock(), new Rock()},
            {new Rock(), new Scissors()},
            {new Rock(), new Paper()},

            {new Scissors(), new Rock()},
            {new Scissors(), new Scissors()},
            {new Scissors(), new Paper()},

            {new Paper(), new Rock()},
            {new Paper(), new Scissors()},
            {new Paper(), new Paper()},
        };

        for (GameObject[] option : options) {
            System.out.format("%s against %s. Result: %d\n", option[0], option[1], option[0].clash(option[1]));
        }

    }
}
