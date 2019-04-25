package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:10:22 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 懒汉式（第二种）线程安全
 */
public class Singleton2 {

    private Singleton2(){
        //私有构造函数
    }
    private static Singleton2 instance = null;

    public static synchronized Singleton2 getInstance(){
        //为了保证多线程环境下正确访问，给方法加上同步锁synchronized
        //慎用  synchronized 关键字，阻塞，性能非常低下的
        //加上synchronized关键字以后，对于getInstance()方法来说，它始终单线程来访问
        //没有充分利用上我们的计算机资源，造成资源的浪费
        if (instance == null) {
            return new Singleton2();
        }
        return instance;
    }
}
