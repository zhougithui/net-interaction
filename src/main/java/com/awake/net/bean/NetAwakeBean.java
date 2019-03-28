package com.awake.net.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class NetAwakeBean implements Serializable {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        NetAwakeBean otherBean = (NetAwakeBean) obj;
        return this.name.equalsIgnoreCase(otherBean.getName());
    }
}
