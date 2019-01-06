package com.kafkaexample.receiver;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafkaexample.model.Car;

public class Receiver{

    //private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch(){
        return latch;
    }

    @KafkaListener(topics="${kafka.topic.json}")
    public void receive(Car car){
        //Logger.info("received car='{}'",car.toString());
        latch.countDown();
    }
}