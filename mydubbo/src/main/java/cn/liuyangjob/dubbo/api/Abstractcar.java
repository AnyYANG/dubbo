package cn.liuyangjob.dubbo.api;

import com.alibaba.dubbo.common.URL;

/**
 * Created by  liuyang
 * 2019/11/22    17:17
 * cn.liuyangjob.dubbo.api
 * All Right Reserved by liuyang.
 **/

public  abstract class Abstractcar  {
    abstract void getColor();
    public void getColorUrl(URL url) {
        System.out.println(url.getHost());
    }
}
