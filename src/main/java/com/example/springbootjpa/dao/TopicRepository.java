package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> { // crudRepository Generic oldugu icin obje turu ve primary key turunu alir (<Topic, String>)

}
