package com.example.pipemployeemanagement.Controller;

import com.example.pipemployeemanagement.dao.RequestController;
import com.example.pipemployeemanagement.entity.Employee;
import com.example.pipemployeemanagement.repository.AddressRepo;
import com.example.pipemployeemanagement.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController
{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AddressRepo addressRepo;

    @PostMapping("/StoreData")
    private Employee StoreData(@RequestBody RequestController request)
    {
      return employeeRepo.save(request.getEmployee());
    }

    @GetMapping("/fetchAllData")
    private List<Employee> fetchAllData()
    {
        return employeeRepo.findAll();
    }
}
