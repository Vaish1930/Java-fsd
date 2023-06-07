package com.example.project_9.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project_9.CustomEventPublisher;

@RestController
public class MainController {

    @GetMapping("/customevent")
    public String CustomEvent(ModelMap map) {
        String confFile = "Beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();
        cvp.publish();

        return "custom event";
    }
}
