package common;

import com.qgx.bean.Phone;

public class FactoryTest {
    public static void main(String[] args) {
        //工厂方法模式
        //各个产品的生产商，都拥有各自的工厂
        //生产工艺，生成的高科技程度都是不一样的
        Phone phone = new HuaWeiFactory().getPhone();
        System.out.println(phone.getName());

        Phone phone1 = new XiaoMiFactory().getPhone();
        System.out.println(phone1.getName());

        //需要用户关心，这个产品的生产商
        //增加的代码的使用复杂度
    }
}
