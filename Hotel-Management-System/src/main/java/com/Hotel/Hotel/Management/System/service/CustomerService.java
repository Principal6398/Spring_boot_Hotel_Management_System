package com.Hotel.Hotel.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Management.System.entity.Customer;
import com.Hotel.Hotel.Management.System.repository.CustomerRespository;

@Service

public class CustomerService {
@Autowired	
private CustomerRespository respository;
   public Customer saveCustomer(Customer customer) {
	   return respository.save(customer);
   }
   public List<Customer> getAllCustomer() {
	   return respository.findAll();
   }
   public Customer getByCustomerId(long id) {
	   return respository.findById(id).orElse(null);
	   
   }
   public void deleteCustomer(long id) {
	    respository.deleteById(id);
   }
}
