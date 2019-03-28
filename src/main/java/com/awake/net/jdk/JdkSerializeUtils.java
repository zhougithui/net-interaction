package com.awake.net.jdk;

import com.awake.net.exception.DeSerializeException;
import com.awake.net.exception.SerializeException;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public final class JdkSerializeUtils {

    /**
     * 序列化对象
     * @param obj
     * @return
     */
    public static byte[] serialize(Object obj){
        byte[] bytes = null;
        try (
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream)
        ) {
            out.writeObject(obj);
            bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            log.error("序列化对象失败,{}", e.getMessage(), e);
            throw new SerializeException("序列化失败", e);
        }
        return bytes;
    }

    /**
     * 反序列化对象
     * @param bytes
     * @param desCls
     * @param <T>
     * @return
     */
    public static <T> T deseialize(byte[] bytes, Class<T> desCls){
        T obj = null;
        try(
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)
        ) {
            obj = (T)objectInputStream.readObject();
        } catch (Exception e){
            log.error("反序列化对象失败,{}", e.getMessage(), e);
            throw new DeSerializeException("序列化失败", e);
        }
        return obj;
    }
}
