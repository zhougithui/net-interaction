package com.awake.net.test.jackson;

import com.awake.net.bean.NetAwakeBean;
import com.awake.net.test.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class ObjectMapperTest extends BaseTest {

    @Test
    public void test(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonStr = objectMapper.writeValueAsString(netAwakeBean);

            NetAwakeBean otherNetBean = objectMapper.readValue(jsonStr, NetAwakeBean.class);

            Assert.assertEquals(netAwakeBean, otherNetBean);
        } catch (JsonProcessingException e) {
            log.error("序列化json异常", e);
        } catch (IOException e) {
            log.error("json反序列化异常", e);
        }
    }
}
