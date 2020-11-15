package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Course;
import com.example.springbootjpa.entity.Topic;
import com.example.springbootjpa.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topics")
public class CourseController {

    @Autowired
    private  CourseService courseService; //final koyunca constructorda initilize edilmesi gerekti.


    @GetMapping(path = "{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId){
        return courseService.getAllCourses(topicId);
    }

    @GetMapping(path = "{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable String id){
        return courseService.getCourseById(id);
    }

    @PostMapping(path = "{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse( course);
    }

    @PutMapping(path = "{topicId}/courses/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Course course,@PathVariable String topicId){
        courseService.updateTopic(course);
    }

    @DeleteMapping(path = "{topicId}/courses/{id}")
    public void deleteTopicById(@PathVariable String id) {
        courseService.deleteTopicById(id);
    }


}
