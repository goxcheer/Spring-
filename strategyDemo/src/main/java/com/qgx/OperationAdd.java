package com.qgx;
/**
 *@Author: Goxcheer
 *@Date:10:04 2019/2/25
 *@Email:604721660@qq.com
 *@decription: +运算策略
 */
public class OperationAdd implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
