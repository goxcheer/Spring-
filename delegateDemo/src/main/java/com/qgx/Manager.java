package com.qgx;
/**
 *@Author: Goxcheer
 *@Date:15:45 2019/2/25
 *@Email:604721660@qq.com
 *@decription: 分配任务的经理
 */
public class Manager implements Job{
    private Job target = null;
    public Manager(Job job){
        this.target = job;
    }

    /**
     * 经理将要做的事情委托给员工去做
     * 做事情的是员工
     * 功劳归经理
     */
    public void doing() {
        this.target.doing();
    }
}
