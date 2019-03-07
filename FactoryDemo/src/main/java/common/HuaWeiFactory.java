package common;

import com.qgx.bean.HuaWei;
import com.qgx.bean.Phone;
/**
 *@Author: Goxcheer
 *@Date:10:21 2019/2/15
 *@Email:604721660@qq.com
 *@decription: 华为工厂
 */
public class HuaWeiFactory implements Factory{
    public Phone getPhone() {
        return new HuaWei();
    }
}
