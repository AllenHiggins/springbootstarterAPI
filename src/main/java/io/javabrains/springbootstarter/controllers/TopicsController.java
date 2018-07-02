package io.javabrains.springbootstarter.controllers;

import io.javabrains.springbootstarter.Models.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic(
                        "spring",
                        "Spring Framework",
                        "Spring Framework Description"),
                new Topic(
                        "java",
                        "Java Core",
                        "Java Core Description")
        );

    }
}
