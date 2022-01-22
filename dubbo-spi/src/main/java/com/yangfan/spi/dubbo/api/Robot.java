package com.yangfan.spi.dubbo.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;
import org.apache.dubbo.rpc.cluster.support.FailoverCluster;

@SPI(FailoverCluster.NAME)
public interface Robot {
    void sayHello(URL url);
}
