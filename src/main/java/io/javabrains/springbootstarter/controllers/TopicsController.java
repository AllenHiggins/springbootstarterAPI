package io.javabrains.springbootstarter.controllers;

import io.javabrains.springbootstarter.Models.Topic;
import io.javabrains.springbootstarter.Services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicsService.getAllTopics();

    }
}
