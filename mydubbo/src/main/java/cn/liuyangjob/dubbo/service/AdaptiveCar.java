package cn.liuyangjob.dubbo.service;

import cn.liuyangjob.dubbo.api.car;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

/**
 * Created by  liuyang
 * 2019/11/22    17:25
 * cn.liuyangjob.dubbo.service
 * All Right Reserved by liuyang.
 **/
@Adaptive
public class AdaptiveCar implements car {

    @Override
    public void getColor() {
        System.out.println("adaptiveCar");
    }

    @Override
    public void getColorUrl(URL url) {
        System.out.println("hahahahahah");
    }
}
