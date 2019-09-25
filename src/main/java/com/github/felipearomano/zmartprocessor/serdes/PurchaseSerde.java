package com.github.felipearomano.zmartprocessor.serdes;

import com.github.felipearomano.zmartprocessor.models.Purchase;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PurchaseSerde implements Serde<Purchase> {
    public void configure(Map<String, ?> configs, boolean isKey) {}

    public void close() {}

    public Serializer<Purchase> serializer() {
        return new JsonSerializer<Purchase>();
    }

    public Deserializer<Purchase> deserializer() {
        return new JsonDeserializer<Purchase>();
    }
}
