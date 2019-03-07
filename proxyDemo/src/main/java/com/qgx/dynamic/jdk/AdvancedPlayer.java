package com.qgx.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@Author: Goxcheer
 *@Date:16:11 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 高玩
 */
public class AdvancedPlayer implements InvocationHandler {
    //代理对象需要持有被代理对象实例的引用
    //实现InvocationHandler
    private Player target;

    public Object getInstance(Player target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this); //原对象类加载器，原对象实现的接口，调用代理类实例的InvocationHandler
    }




    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(this.target, args);
        String methodName = method.getName();
        if ("shangfen".equals(methodName)) {
            System.out.println("我是峡谷王者，免费帮你代练");
        }
        if ("peiwan".equals(methodName)){
            System.out.println("我是峡谷王者，我陪你玩");
        }
        return null;
    }
}
