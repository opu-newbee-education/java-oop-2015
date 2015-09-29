package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 29.09.2015.
 */
public class Paper extends GameObject {
    public Paper() {
        super(GameObjectType.paper);
    }

    @Override
    public int clash(GameObject other) {
        return other.getType() == GameObjectType.rock ? 1 : 0;
    }
}
