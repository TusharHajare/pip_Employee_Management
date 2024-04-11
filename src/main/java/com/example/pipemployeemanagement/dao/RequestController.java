package com.example.pipemployeemanagement.dao;

import com.example.pipemployeemanagement.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestController
{
    private Employee employee;
}
