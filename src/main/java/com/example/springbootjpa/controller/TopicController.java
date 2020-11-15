package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Topic;
import com.example.springbootjpa.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topics")
public class TopicController {


    private final TopicService topicService; //final koyunca constructorda initilize eeilmeqsi gerekti.

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping(path = "{id}")
    public Topic getTopicById(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @PostMapping
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping(path = "{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTopicById(@PathVariable String id) {
        topicService.deleteTopicById(id);
    }


}
