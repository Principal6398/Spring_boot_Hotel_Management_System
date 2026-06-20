package com.Hotel.Hotel.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Management.System.entity.Customer;
import com.Hotel.Hotel.Management.System.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
		
	}
	@GetMapping
	public List<Customer>getAllCustomer(){
		return service.getAllCustomer();
	}
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		return service.getByCustomerId(id);
		
	}
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Customer delete";
	}

}
