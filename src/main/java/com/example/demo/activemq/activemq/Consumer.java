package com.example.demo.activemq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "inboundQueue")
    public void receive(String message) {
        System.out.println(String.format("The message is: %s", message));
    }
}
