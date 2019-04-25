package com.qgx;
/**
 *@Author: Goxcheer
 *@Date:9:59 2019/2/25
 *@Email:604721660@qq.com
 *@decription: 策略接口
 */
public interface Strategy {
    //策略的前提是首先要做一件事情，这件事情的结果一样，只是过程不同
    //抽象到代码中就是结果或者结果的类型相同
    public int doOperation(int num1, int num2);
}
