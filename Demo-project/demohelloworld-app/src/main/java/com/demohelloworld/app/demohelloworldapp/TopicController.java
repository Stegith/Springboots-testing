package com.demohelloworld.app.demohelloworldapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TopicController {

    private final TopicRepository topicRepository;
    @GetMapping("/topic")
    public List<Topic> getUsers() {
        return (List<Topic>) topicRepository.findAll();
    }
    @PostMapping("/topic")
    void addUser(@RequestBody Topic topic) {
        topicRepository.save(topic);
    }
}
