package com.github.felipearomano.zmartprocessor.serdes;

import com.github.felipearomano.zmartprocessor.models.PurchaseKey;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PurchaseKeySerde implements Serde<PurchaseKey> {

    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    public void close() {

    }

    public Serializer<PurchaseKey> serializer() {
        return new JsonSerializer<PurchaseKey>();
    }

    public Deserializer<PurchaseKey> deserializer() {
        return new JsonDeserializer<PurchaseKey>();
    }
}
