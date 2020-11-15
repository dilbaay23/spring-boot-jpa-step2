package com.example.springbootjpa.service;

import com.example.springbootjpa.dao.CourseRepository;
import com.example.springbootjpa.entity.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;


    }

    public Course getCourseById(String id) {
       return courseRepository.findById(id).get();

    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateTopic( Course course) {
        courseRepository.save(course);
    }

    public void deleteTopicById(String id) {
        courseRepository.deleteById(id);
    }


}
