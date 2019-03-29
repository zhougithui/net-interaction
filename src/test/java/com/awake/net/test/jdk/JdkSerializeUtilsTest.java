package com.awake.net.test.jdk;

import com.awake.net.bean.NetAwakeBean;
import com.awake.net.jdk.JdkSerializeUtils;
import com.awake.net.test.BaseTest;
import junit.framework.Assert;
import org.junit.Test;

public class JdkSerializeUtilsTest extends BaseTest {


    @Test
    public void testSerializeAndDeserialize(){
        byte[] bytes = JdkSerializeUtils.serialize(netAwakeBean);
        NetAwakeBean anotherNetAwakeBean = JdkSerializeUtils.deseialize(bytes, NetAwakeBean.class);
        Assert.assertEquals(netAwakeBean, anotherNetAwakeBean);
    }
}
