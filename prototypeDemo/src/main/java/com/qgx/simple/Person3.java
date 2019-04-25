package com.qgx.simple;

/**
 * 实现Cloneable接口
 * 重写clone()
 */
public class Person3 implements Cloneable{
    private String name;
    private Dog dog;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深度克隆实际上是为每一个引用对象都进行clone
        Person3 person3 =(Person3)super.clone();  //Person3克隆
        Dog dog = (Dog)person3.getDog().clone(); //Dog克隆
        person3.dog = dog;  //引用属性也指向克隆实例
        return person3;
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
        return "Person3{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog(3,"泰迪");
        Person3 p = new Person3();
        p.setName("张三");
        p.setDog(dog);
        try {
            Person3 p2 = (Person3) p.clone();
            p.setName("李四");
            p.getDog().setType("藏獒");
            System.out.println(p.getDog() == p2.getDog());
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
