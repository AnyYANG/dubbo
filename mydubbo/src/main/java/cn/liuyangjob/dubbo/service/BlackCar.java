package cn.liuyangjob.dubbo.service;

import cn.liuyangjob.dubbo.api.Car;
import com.alibaba.dubbo.common.URL;

/**
 * Created by  liuyang
 * 2019/11/22    14:50
 * cn.liuyangjob.dubbo.service
 * All Right Reserved by liuyang.
 **/
public class BlackCar  implements Car {
    @Override
    public void getColor() {
        System.out.println("BLACK");
    }

    @Override
    public void getColorUrl(URL url) {
        System.out.println("black Car");
    }
}
