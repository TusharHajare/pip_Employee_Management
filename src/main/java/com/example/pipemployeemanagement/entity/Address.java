package com.example.pipemployeemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address
{
    @Id
    private int id;
    private String city;
    private String state;
    private String country;
    private String street;
    private String zipcode;

}
