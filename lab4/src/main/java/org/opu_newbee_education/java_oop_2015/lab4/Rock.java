package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 29.09.2015.
 */
public class Rock extends GameObject {
    public Rock() {
        super(GameObjectType.rock);
    }

    @Override
    public int clash(GameObject other) {
        return other.getType() == GameObjectType.scissors ? 1 : 0;
    }
}
