package com.Hotel.Hotel.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel.Hotel.Management.System.entity.Customer;

public interface CustomerRespository  extends JpaRepository<Customer,Long> {
  // this help to get thsi methods automatically save(),findAll(),findById(),deleteById(),existsById(),delete()
}
