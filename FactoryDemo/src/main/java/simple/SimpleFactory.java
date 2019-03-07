package simple;

import com.qgx.bean.HuaWei;
import com.qgx.bean.OnePlus;
import com.qgx.bean.Phone;
import com.qgx.bean.XiaoMi;

/**
 *@Author: Goxcheer
 *@Date:9:51 2019/2/15
 *@Email:604721660@qq.com
 *@decription:
 */
//对于这个工厂来说(太强大了)
//为什么？
//这个工厂啥都能干(不符合现实)
//编码也是一种艺术(融汇贯通),艺术来源于生活，回归到生活的
public class SimpleFactory {
    //实现统一管理、专业化管理
    //如果没有工厂模式，小作坊，没有执行标准的
    //如果买到三无产品（没有标准）
    //卫生监督局工作难度会大大减轻

    //只关心结果质量，隐藏产出过程

    public Phone getPhone(String name){
        if (("huawei").equalsIgnoreCase(name)) {
            return new HuaWei();
        }
        if (("xiaomi").equalsIgnoreCase(name)) {
            return new XiaoMi();
        }
        if (("oneplus").equalsIgnoreCase(name)){
            return new OnePlus();
        }
        else {
            System.out.println("你要买的手机我们没有啊，老铁！");
            return null;
        }
    }
    public static void main(String[] args) {
        Phone phone = new SimpleFactory().getPhone("huawei");
        System.out.println(phone.getName());
    }
}
