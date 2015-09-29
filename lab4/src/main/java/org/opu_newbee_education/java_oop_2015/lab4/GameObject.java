package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 29.09.2015.
 */
public abstract class GameObject {
    private GameObjectType type;

    public GameObjectType getType() {
        return type;
    }

    GameObject(GameObjectType type) {
        this.type = type;
    }

    abstract int clash(GameObject other);

    @Override
    public String toString() {
        return type.toString();
    }
}
