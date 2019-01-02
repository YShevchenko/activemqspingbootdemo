package com.example.demo.activemq.activemq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/{message}")
    public void send(@PathVariable String message) {
        jmsTemplate.convertAndSend("inboundQueue", message);
    }
}
