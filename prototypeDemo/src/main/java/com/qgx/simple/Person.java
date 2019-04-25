package com.qgx.simple;
/**
 *@Author: Goxcheer
 *@Date:16:07 2019/2/29
 *@Email:604721660@qq.com
 *@decription: Person实体
 */
public class Person {
    private String name;
    private Dog dog;

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public Person(Person p){
        this.name = p.name;
        this.dog = p.dog;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public static void main(String[] args) {
        Dog dog = new Dog(3,"泰迪");
        Person p = new Person("张三",dog);
        Person p2 = new Person(p);
        //修改p的name和dog属性，看p2是否跟着变化
        p.setName("小二");
        p.getDog().setType("藏獒");
        System.out.println(p2.getName());
        System.out.println(p2.getDog().getType());
    }
}
