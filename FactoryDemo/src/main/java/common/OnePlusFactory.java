package common;

import com.qgx.bean.OnePlus;
import com.qgx.bean.Phone;

/**
 *@Author: Goxcheer
 *@Date:10:25 2019/2/15
 *@Email:604721660@qq.com
 *@decription: 一加工厂
 */
public class OnePlusFactory implements Factory{

    public Phone getPhone() {
        return new OnePlus();
    }
}
