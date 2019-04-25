package com.qgx;
/**
 *@Author: Goxcheer
 *@Date:10:11 2019/2/25
 *@Email:604721660@qq.com
 *@decription: 运用语境
 */
public class Context {
    private Strategy target;
    public Context(Strategy strategy){
        this.target = strategy;
    }
    public int executeStrategy(int num1, int num2){
        //根据OOP，实际调用的是传入的实例对象的引用
        return target.doOperation(num1,num2);
    }
}
