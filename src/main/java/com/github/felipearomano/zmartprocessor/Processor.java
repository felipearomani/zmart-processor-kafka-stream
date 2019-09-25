package com.github.felipearomano.zmartprocessor;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.processor.WallclockTimestampExtractor;

import java.util.Properties;

public class Processor {

  public static void main(String[] args) {

      Properties config1 = getProperties();

      StreamsBuilder streamsBuilder = new StreamsBuilder();


  }

    private static Properties getProperties() {
        Properties config = new Properties();
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "zmart-processor-group");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.StringSerde.class);
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.StringSerde.class);
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "zmart-processor");
        config.put(StreamsConfig.DEFAULT_TIMESTAMP_EXTRACTOR_CLASS_CONFIG, WallclockTimestampExtractor.class);
        config.put(StreamsConfig.REPLICATION_FACTOR_CONFIG, "1");
        return config;
    }

}
