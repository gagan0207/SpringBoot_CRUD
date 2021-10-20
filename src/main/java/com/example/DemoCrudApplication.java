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
        student s=studentservice.getStudentById(6) ;
        System.out.println(s.toString());
        s.setLast_name("hedge");
        studentservice.updateStdent(s);



        studentservice.getAllStdents().forEach(s1->log.info(s1.toString()));
        System.out.println("complete");

    }
}
