package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:10:07 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 饿汉式
 */
//在类初始化时，已经自行实例化
public class Singleton {

    //默认构造方法私有化
    private Singleton(){
    }
    //声明静态变量，在类实例化之前就初始化变量,将对象引用保存
    private static final Singleton instance = new Singleton();

    //开放静态方法，获取实例
    public static Singleton getInstance(){
        return  instance;
    }
    //饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
}
