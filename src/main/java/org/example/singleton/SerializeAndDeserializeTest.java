package org.example.singleton;

import java.io.*;

public class SerializeAndDeserializeTest {

    static SingletonSerializeAndDesrialize instanceOne = SingletonSerializeAndDesrialize.getInstance();

    public static void main(String[] args) {
        try {
            // Serialize to a file

            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            instanceOne.setX(200);

            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            SingletonSerializeAndDesrialize instanceTwo = (SingletonSerializeAndDesrialize) in.readObject();
            in.close();

            System.out.println(instanceOne.getX());
            System.out.println(instanceTwo.getX());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
