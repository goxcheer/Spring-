package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:10:14 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 懒汉式（第一种）线程不安全
 */
//懒汉式单例类.在第一次调用的时候实例化自己
public class Singleton1 {

    private Singleton1(){
        //构造函数私有化
    }
    //然后声明一个静态变量保存单例的引用
    private static Singleton1 instance = null;

    public static Singleton1 getInstance(){
        // 通过提供一个静态方法来获得单例的引用
        if (instance == null) { //存在线程安全的问题
            instance = new Singleton1();
        }
        return instance;
    }
}
