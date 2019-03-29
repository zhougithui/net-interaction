package com.awake.net.test;

import com.awake.net.bean.NetAwakeBean;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected static NetAwakeBean netAwakeBean = new NetAwakeBean();

    @BeforeClass
    public static void init(){
        netAwakeBean.setAge(20);
        netAwakeBean.setName("awake man");

        NetAwakeBean otherNetBean = new NetAwakeBean();
        otherNetBean.setName("awake other man");
        otherNetBean.setAge(18);

        Map<String, NetAwakeBean> netAwakeBeanMap = new HashMap<>();
        netAwakeBeanMap.put(otherNetBean.getName(), otherNetBean);
        netAwakeBean.setNetAwakeBeanMap(netAwakeBeanMap);
    }
}
