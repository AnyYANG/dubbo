package cn.liuyangjob.dubbo.api;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created by  liuyang
 * 2019/11/22    14:49
 * cn.liuyangjob.dubbo.api
 * All Right Reserved by liuyang.
 **/
@SPI
public interface car {
    void getColor();
    void getColorUrl(URL url);
}
