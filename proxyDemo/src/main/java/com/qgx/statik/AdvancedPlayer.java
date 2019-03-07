package com.qgx.statik;
/**
 *@Author: Goxcheer
 *@Date:9:14 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 高玩
 */
public class AdvancedPlayer implements Player{
    //代理对象需要持有真实对象
    //对真实对象进行封装，实现扩展
    private Noob target;

    public void shangfen() {
        target = new Noob();
        target.shangfen();
        System.out.println("我是王者玩家，我帮你上到钻石");
    }
}
