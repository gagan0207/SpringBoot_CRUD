package com.example;

import com.example.entity.student;
import com.example.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoCrudApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory
            .getLogger(DemoCrudApplication.class);
    @Autowired
    public studentservice studentservice;

    public static void main(String[] args) {
        SpringApplication.run(DemoCrudApplication.class,args);
    }


    @Override
    public void run(String... args) throws Exception
    {
        //GET all values
        studentservice.getAllStdents()
                .forEach(s1->log.info(s1.toString()));

        //GET one value
        student s=studentservice.getStudentById(6) ;
        System.out.println(s.toString());

        //how to add values into db
        studentservice.addstudent(new student("Ram","Charan","RC25@gmail.com"));

        //Update values -> get the value first by using getStudentBYId() and
        // set what u want to update and then use that method
        student s1=studentservice.getStudentById(6) ;
        s1.setLast_name("hedge");
        studentservice.updateStdent(s1);

        //Delete value
        studentservice.deletestudent(6);

        studentservice.getAllStdents()
                .forEach(s2->log.info(s2.toString()));

        //just for checking whether all opertions are completed or not
        System.out.println("complete");

    }
}
