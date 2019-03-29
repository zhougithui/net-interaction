package com.awake.net.test.jackson;

import java.io.IOException;

import com.awake.net.bean.zoo.Elephant;
import com.awake.net.bean.zoo.Lion;
import com.awake.net.bean.zoo.Zoo;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class SerializeZoo {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
         Zoo zoo = new Zoo("London Zoo", "London");
         Lion lion = new Lion("Simba");
         Elephant elephant = new Elephant("Manny");
         zoo.addAnimal(elephant).add(lion);
         ObjectMapper mapper = new ObjectMapper();
         mapper.writeValue(System.out, zoo);


        zoo = mapper.readValue(mapper.writeValueAsString(zoo), Zoo.class);
        System.out.println(zoo);
    }
}