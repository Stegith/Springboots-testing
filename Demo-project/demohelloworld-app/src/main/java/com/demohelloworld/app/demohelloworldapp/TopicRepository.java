package com.demohelloworld.app.demohelloworldapp;

import java.util.stream.Stream;

public interface TopicRepository extends CrudRepository<Topic, Long> {

    Stream findAll();

    void save(Topic topic);

    
}
