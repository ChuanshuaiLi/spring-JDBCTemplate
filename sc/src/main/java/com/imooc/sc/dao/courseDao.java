package com.imooc.sc.dao;

import com.imooc.sc.entity.Course;
import com.imooc.sc.entity.Student;

import java.util.List;

public interface courseDao {

    void insert(Course course);
    void update(Course course);
    void delete(Course course);
    Student select(int id);
    List<Student> selectAll();
}
