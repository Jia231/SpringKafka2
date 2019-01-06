package com.kafkaexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.kafkaexample.model.Car;
import com.kafkaexample.sender.Sender;

@RestController
public class IndexController{
 

    @Autowired
    Sender kafkaSender;

    @PostMapping("/kafka/{topicName}")
    public String sendToTopic(@PathVariable String topicName, @RequestBody Car car) {
        kafkaSender.send(topicName,car);
        return "Message sent";
    }

    @RequestMapping("/")
    public String index(){
        String str = "Hello from Spring";
        
        return str;
    }
}