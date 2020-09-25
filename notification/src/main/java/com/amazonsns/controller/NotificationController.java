package com.amazonsns.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class NotificationController {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationController.class);

    @PostConstruct
    public void postConstruct() {
        LOG.info("Notification Controller Fired Up");
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("Notification Controller Ready to use");
    }

    @GetMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
