package abst;

import com.qgx.bean.HuaWei;
import com.qgx.bean.Phone;
import common.Factory;

/**
 *@Author: Goxcheer
 *@Date:10:21 2019/2/15
 *@Email:604721660@qq.com
 *@decription: 华为工厂
 */
public class HuaWeiFactory extends AbstractFactory{
    public Phone getPhone() {
        return new HuaWei();
    }
}
