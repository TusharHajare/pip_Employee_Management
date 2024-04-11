package com.example.pipemployeemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee
{
    @Id
    private int employee_id;
    private String firstname;
    private String lastname;
    private int ecount;
    private  String Phone_number;
    private String designation;
    private String email_address;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "EA_FK",referencedColumnName = "employee_id")
    private List<Address> addresses;

}
