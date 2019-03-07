package abst;

import com.qgx.bean.HuaWei;
import com.qgx.bean.OnePlus;
import com.qgx.bean.Phone;
import com.qgx.bean.XiaoMi;

/**
 *@Author: Goxcheer
 *@Date:10:48 2019/3/7
 *@Email:604721660@qq.com
 *@decription: 抽象工厂
 */
public abstract class AbstractFactory {
    //巧妙的运用了抽象类的特性，抽象方法和具体实现

    abstract Phone getPhone();

    //这段代码就是动态配置的功能
    //固定模式的委派
    public Phone getPhone(String name){
        if (("huawei").equalsIgnoreCase(name)) {
            return new HuaWeiFactory().getPhone();
        }
        if (("xiaomi").equalsIgnoreCase(name)) {
            return new XiaoMiFactory().getPhone();
        }
        if (("oneplus").equalsIgnoreCase(name)){
            return new OnePlusFactory().getPhone();
        }
        else {
            System.out.println("你要买的手机我们没有啊，老铁！");
            return null;
        }
    }
}
