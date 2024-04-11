package com.example.pipemployeemanagement.repository;

import com.example.pipemployeemanagement.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer>
{

}
