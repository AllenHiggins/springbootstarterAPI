package io.javabrains.springbootstarter.controllers;

import io.javabrains.springbootstarter.Models.Topic;
import io.javabrains.springbootstarter.Services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicsService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicsService.addTopic(topic );
    }

    // removed - @PathVariable String id and id - as argument
    @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic){
        topicsService.updateTopic(topic );
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicsService.deleteTopic(id);
    }
}
