package com.qgx.statik;
/**
 *@Author: Goxcheer
 *@Date:9:19 2019/2/20
 *@Email:604721660@qq.com
 *@decription:静态代理的测试类
 */
public class Test1 {
    //优点：扩展原功能，不侵入原代码。
    //缺点：如果原对象是N个，需要代码的方法也是N个，代理类就会很繁琐。
    public static void main(String[] args) {
        Player player = new AdvancedPlayer();
        player.shangfen();
    }
}
