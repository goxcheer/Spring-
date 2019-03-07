package com.qgx.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.tools.ant.taskdefs.Echo;

import java.lang.reflect.Method;

/**
 *@Author: Goxcheer
 *@Date:16:09 2019/2/10
 *@Email:604721660@qq.com
 *@decription: 菜鸟玩家
 */
public class Noob  {

    public void shangfen() {
        System.out.println("--------------------");
        System.out.println("我是玩家菜鸟，我上不去分，找代练，我要上分");
        System.out.println("--------------------");
    }
}
