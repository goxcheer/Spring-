package common;

import com.qgx.bean.Phone;
import com.qgx.bean.XiaoMi;

/**
 *@Author: Goxcheer
 *@Date:10:23 2019/2/15
 *@Email:604721660@qq.com
 *@decription: 小米工厂
 */
public class XiaoMiFactory implements Factory{

    public Phone getPhone() {
        return new XiaoMi();
    }
}
