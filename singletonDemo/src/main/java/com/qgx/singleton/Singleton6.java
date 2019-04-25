package com.qgx.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *@Author: Goxcheer
 *@Date:11:08 2019/2/20
 *@Email:604721660@qq.com
 *@decription: 登记式单例
 */
//类似Spring里面的方法，将类名注册，下次从里面直接获取。
public class Singleton6 {

    private static Map<String,Singleton6> map = new HashMap<String,Singleton6>();

    private Singleton6(){
    }

    static{
        Singleton6 instance = new Singleton6();
        map.put(Singleton6.class.getName(),instance);
    }

    public static Singleton6 getInstance(String name){
        if (name == null){
            name = Singleton6.class.getName();
        }
        if (map.get(name) == null) {
            try{
                map.put(name, (Singleton6) Class.forName(name).newInstance());
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
