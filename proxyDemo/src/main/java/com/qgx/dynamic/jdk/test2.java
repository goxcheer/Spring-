package com.qgx.dynamic.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class test2 {

    public static void main(String[] args) {
        Player player = (Player) new AdvancedPlayer().getInstance(new Noob());
        /*player.shangfen();*/
        player.peiwan();
        try {
            //获取字节码内容
            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Player.class});
            FileOutputStream os = new FileOutputStream("E:/$Proxy0.class");
            os.write(data);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
