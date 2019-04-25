package com.qgx.simple;

/**
 * 实现Cloneable接口
 * 重写clone()调用super.clone()
 */
public class Person2 implements Cloneable{
    private String name;
    private Dog dog;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog(3,"泰迪");
        Person2 p = new Person2();
        p.setName("张三");
        p.setDog(dog);
        try {
            Person2 p2 = (Person2) p.clone();
            p.setName("李四");
            p.getDog().setType("藏獒");
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
