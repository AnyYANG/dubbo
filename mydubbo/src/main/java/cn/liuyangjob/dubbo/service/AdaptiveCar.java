package cn.liuyangjob.dubbo.service;

import cn.liuyangjob.dubbo.api.Car;
import com.alibaba.dubbo.common.URL;

/**
 * Created by  liuyang
 * 2019/11/22    17:25
 * cn.liuyangjob.dubbo.service
 * All Right Reserved by liuyang.
 **/
public class AdaptiveCar implements Car {
    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }
    @Override
    public void getColor() {
        System.out.println("adaptiveCar");
    }

    @Override
    public void getColorUrl(URL url) {
        System.out.println("adaptive class");
        car.getColorUrl(url);
    }
}
