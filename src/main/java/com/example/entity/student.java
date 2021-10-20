package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer", schema="public", catalog = "postgres")
public class student
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String first_name;

    private String last_name;

    private String email;

    public student(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }



    public String toString()
    {
        return "student [ id = " + id + ", first_name = " + first_name + ", last_name = " + last_name +
                ", email = " +email+ "]";
    }
}
