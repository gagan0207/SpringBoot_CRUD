package com.example.service;

import com.example.entity.student;
import com.example.repository.studentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice
{
    private static final Logger log = LoggerFactory
            .getLogger(studentservice.class);
    @Autowired
    studentRepository studentRepository;


    public List<student> getAllStdents()
    {
        return studentRepository.findAll();

    }
    public student getStudentById(int id)
    {
        return studentRepository.findById(id).get();
    }
    public void addstudent(student student)
    {
         studentRepository.save(student);
    }

    public void deletestudent(int id){studentRepository.deleteById(id);}

    public void updateStdent(student student)
    {
        studentRepository.saveAndFlush(student);
    }

}
