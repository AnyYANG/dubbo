package cn.liuyangjob.dubbo.SPIDubbo;


import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

import java.io.IOException;

/**
 * Created by  liuyang
 * 2019/11/22    16:38
 * cn.liuyangjob.dubbo.SPIDubbo
 * All Right Reserved by liuyang.
 **/

public class SPIDubboTest {
    public static void main(String args[]) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        extensionLoader.getAdaptiveExtension();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
