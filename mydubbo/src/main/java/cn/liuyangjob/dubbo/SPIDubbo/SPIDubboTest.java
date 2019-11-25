package cn.liuyangjob.dubbo.SPIDubbo;


import cn.liuyangjob.dubbo.api.Car;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.io.IOException;
/**
 * Created by  liuyang
 * 2019/11/22    16:38
 * cn.liuyangjob.dubbo.SPIDubbo
 * All Right Reserved by liuyang.
 **/

public class SPIDubboTest {
    public static void main(String args[]) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car mycar = extensionLoader.getExtension("adaptivecar");
        URL url = new URL("dubbo","www.liuyang.com",10086,"path");
        url = url.addParameters("car","red");
        mycar.getColorUrl(url);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
