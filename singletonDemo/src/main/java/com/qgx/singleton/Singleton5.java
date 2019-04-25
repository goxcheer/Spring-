package com.qgx.singleton;
/**
 *@Author: Goxcheer
 *@Date:14:40 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 枚举法
 */
public enum Singleton5 {
    instance;
    public void methodInSingleton(){
        System.out.println("单例类中的方法");
    }
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.instance;
        instance.methodInSingleton();
    }
}
