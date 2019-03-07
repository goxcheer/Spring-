package com.qgx.dynamic.cglib;

public class test3 {

    public static void main(String[] args) {
        //CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
        //生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
        //子类引用赋值给父类
        try {
            Noob noob = (Noob)new AdvancedPlayer().getInstance(new Noob().getClass());
            noob.shangfen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
