package com.qgx.simple;
/**
 *@Author: Goxcheer
 *@Date:16:05 2019/2/29
 *@Email:604721660@qq.com
 *@decription: dog实体
 */
public class Dog implements Cloneable{
    private int age;
    private String type;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Dog(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
