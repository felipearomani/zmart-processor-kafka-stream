package com.github.felipearomano.zmartprocessor.serdes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class JsonSerializer<T> implements Serializer<T> {

    public void configure(Map<String, ?> configs, boolean isKey) {}

    public byte[] serialize(String s, T data) {
        return getBytes(data);
    }

    public byte[] serialize(String topic, Headers headers, T data) {
        return getBytes(data);
    }

    private byte[] getBytes(T data) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.writeValueAsBytes(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void close() {

    }
}
