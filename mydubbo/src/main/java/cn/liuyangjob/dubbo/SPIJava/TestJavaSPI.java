package cn.liuyangjob.dubbo.SPIJava;

import cn.liuyangjob.dubbo.api.Car;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by  liuyang
 * 2019/11/22    15:04
 * cn.liuyangjob.dubbo.SPIJava
 * All Right Reserved by liuyang.
 **/

public class TestJavaSPI {
    public static void main(String args[]) {
        ServiceLoader<Car> carServiceLoader = ServiceLoader.load(Car.class);
        Iterator<Car> cars = carServiceLoader.iterator();
        cars.forEachRemaining(car->car.getColor());
    }
}
