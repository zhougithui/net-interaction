package com.awake.net.test.jackson;

import com.awake.net.bean.mix.Bird;
import com.awake.net.bean.mix.BirdMixIn;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
 
public class SerializeExample3 {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Bird.class, BirdMixIn.class);
        Bird bird = new Bird("scarlet Ibis");
        bird.setSound("eee");
        bird.setHabitat("water");
 
        mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, bird);
    }
 
}