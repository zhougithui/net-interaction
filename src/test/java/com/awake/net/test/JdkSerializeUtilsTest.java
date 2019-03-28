package com.awake.net.test;

import com.awake.net.bean.NetAwakeBean;
import com.awake.net.jdk.JdkSerializeUtils;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JdkSerializeUtilsTest {
    private static NetAwakeBean netAwakeBean = new NetAwakeBean();

    @BeforeClass
    public static void init(){
        netAwakeBean.setAge(20);
        netAwakeBean.setName("awake man");
    }

    @Test
    public void testSerializeAndDeserialize(){
        byte[] bytes = JdkSerializeUtils.serialize(netAwakeBean);
        NetAwakeBean anotherNetAwakeBean = JdkSerializeUtils.deseialize(bytes, NetAwakeBean.class);
        Assert.assertEquals(netAwakeBean, anotherNetAwakeBean);
    }
}
