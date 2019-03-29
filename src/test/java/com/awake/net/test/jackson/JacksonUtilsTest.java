package com.awake.net.test.jackson;

import com.awake.net.bean.NetAwakeBean;
import com.awake.net.json.jackson.JacksonUtils;
import com.awake.net.test.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class JacksonUtilsTest extends BaseTest {

    @Test
    public void test(){
        log.info(JacksonUtils.pojo2Json(netAwakeBean));
        NetAwakeBean otherNetBean = JacksonUtils.json2Pojo(
                JacksonUtils.pojo2Json(netAwakeBean), NetAwakeBean.class);
        Assert.assertEquals(netAwakeBean, otherNetBean);
    }

}
