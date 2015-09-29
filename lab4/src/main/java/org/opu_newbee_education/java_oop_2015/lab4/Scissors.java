package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 29.09.2015.
 */
public class Scissors extends GameObject {
    public Scissors() {
        super(GameObjectType.scissors);
    }

    @Override
    public int clash(GameObject other) {
        return other.getType() == GameObjectType.paper ? 1 : 0;
    }
}
