package com.awake.net.bean.mix;

import com.fasterxml.jackson.annotation.JsonProperty;
 
public abstract class BirdMixIn {
    BirdMixIn(@JsonProperty("name") String name) {
    };
 
    @JsonProperty("sound")
    abstract String getSound();
 
    @JsonProperty("habitat")
    abstract String getHabitat();
}