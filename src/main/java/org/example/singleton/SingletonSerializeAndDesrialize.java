package org.example.singleton;

import java.io.Serializable;

public class SingletonSerializeAndDesrialize implements Serializable {
    private int x=100;

    private static volatile SingletonSerializeAndDesrialize singletonInstance = new SingletonSerializeAndDesrialize();

    private SingletonSerializeAndDesrialize() {

    }

    public static SingletonSerializeAndDesrialize getInstance() {
        return singletonInstance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
