package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:10:29 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 懒汉式（第三种）双重锁检查
 */
public class Singleton3 {

    private Singleton3(){
    //默认构造私有化
    }

    private static Singleton3 instance = null;

    public static Singleton3 getInstance(){
        //为了保证多线程环境下的另一种实现方式，双重锁检查
        //性能，第一次的时候访问效率低，在创建实例之后效率高
        if (instance == null) {
            synchronized (Singleton3.class){
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
