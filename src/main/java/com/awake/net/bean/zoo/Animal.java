package com.awake.net.bean.zoo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
@JsonSubTypes({ @JsonSubTypes.Type(value = Lion.class, name = "lion"), @JsonSubTypes.Type(value = Elephant.class, name = "elephant") })
public class Animal {

    public String name;
}
