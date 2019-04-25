package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:10:38 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 懒汉式（第四种）静态内部类
 */
public class Singleton4 {
    private Singleton4(){
        //默认构造函数私有化
    }
    //先声明一个静态内部类
    //private 私有的保证别人不能修改
    //static 保证全局唯一
    private static class LazyLoader{
        //final 为了防止内部误操作，代理模式，GgLib的代理模式
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static final Singleton4 getInstance(){
        //LazyLoader只有在第一次调用getInstance方法的时候才会被加载
        return LazyLoader.INSTANCE;
    }
}
