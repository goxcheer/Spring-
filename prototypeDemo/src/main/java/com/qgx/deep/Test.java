package com.qgx.deep;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三",new Dog(3,"泰迪"));
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            //序列化
        baos = new ByteArrayOutputStream();
        oos = new ObjectOutputStream(baos);
        oos.writeObject(p1);

        //反序列化
        bais = new ByteArrayInputStream(baos.toByteArray());
        ois = new ObjectInputStream(bais);
        Person p2 = (Person)ois.readObject();
        System.out.println(p1 == p2); //对象是否相同引用
        System.out.println(p1.getDog() == p2.getDog()); //对象的引用属性是否相同引用
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
