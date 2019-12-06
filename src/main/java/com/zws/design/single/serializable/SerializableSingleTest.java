package com.zws.design.single.serializable;

import java.io.*;

/**
 * @author zhengws
 * @date 2019-07-19 18:51
 */
public class SerializableSingleTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instance = SerializableSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single-instance"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("single-instance")));
        SerializableSingleton newInstance = (SerializableSingleton)ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
