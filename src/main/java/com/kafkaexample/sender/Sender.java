package com.kafkaexample.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import com.kafkaexample.model.Car;


public class Sender{
    //private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    /*@Value("${kafka.topic.json}")
    private String jsonTopic;*/

    @Autowired
    private KafkaTemplate<String,Car> kafkaTemplate;

    public void send(String jsonTopic,Car car){
        /*System.out.println(car);
        System.out.println(jsonTopic);*/
        kafkaTemplate.send(jsonTopic,car);
    }
}
