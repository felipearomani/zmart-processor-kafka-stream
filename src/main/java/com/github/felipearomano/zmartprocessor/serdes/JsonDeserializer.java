package com.github.felipearomano.zmartprocessor.serdes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class JsonDeserializer<T> implements Deserializer<T> {


    private Class<T> deserializedClass;
    private ObjectMapper mapper;

    public JsonDeserializer(Class<T> deserializedClass) {
        this.deserializedClass = deserializedClass;
        init();
    }

    public JsonDeserializer() {
        init();
    }

    private void init() {
        this.mapper = new ObjectMapper();
    }

    @SuppressWarnings("unchecked")
    public void configure(Map<String, ?> configs, boolean isKey) {
        if (deserializedClass == null) {
            deserializedClass = (Class<T>) configs.get("serializedClass");
        }
    }

    public T deserialize(String s, byte[] data) {

        try {
            return mapper.readValue(data, deserializedClass);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public T deserialize(String topic, Headers headers, byte[] data) {
        return null;
    }

    public void close() {

    }
}
