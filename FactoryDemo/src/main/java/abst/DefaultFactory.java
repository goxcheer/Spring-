package abst;

import com.qgx.bean.HuaWei;
import com.qgx.bean.Phone;

/**
 *@Author: Goxcheer
 *@Date:11:11 2019/3/7 
 *@Email:604721660@qq.com
 *@decription: 默认工厂
 */
public class DefaultFactory extends AbstractFactory{

    private HuaWeiFactory defaultFactory = new HuaWeiFactory();

    Phone getPhone() {
        return defaultFactory.getPhone();
    }
}
