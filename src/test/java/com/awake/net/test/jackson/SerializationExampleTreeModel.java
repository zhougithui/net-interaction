package com.awake.net.test.jackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class SerializationExampleTreeModel {

    public static void main(String[] args) throws IOException {
        JsonNodeFactory factory = new JsonNodeFactory(false);

        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jsonGenerator = jsonFactory.createGenerator(System.out);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ObjectNode album = factory.objectNode();

        mapper.writeTree(jsonGenerator, album);
        ArrayNode jsonNodes = factory.arrayNode();
        jsonNodes.add("a");
        jsonNodes.add("b");

        album.set("nodes", jsonNodes);

        mapper.writeTree(jsonGenerator, album);
    }
 
}