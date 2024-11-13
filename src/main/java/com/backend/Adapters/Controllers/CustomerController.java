package com.backend.Adapters.Controllers;

import com.backend.Adapters.dto.CustomerDto;
import com.backend.Application.Services.Impl.CustomerServiceImpl;
import com.backend.Application.Services.Models.Customer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerServiceImpl customerService;

    // CREATING CUSTOMER
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    // GETTING CUSTOMER WITH ID
    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") long id){
        CustomerDto customerDto = customerService.getCustomer(id);
        return ResponseEntity.ok(customerDto);
    }
    // GETTING ALL CUSTOMERS
    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        List<CustomerDto> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }
    // UPDATING CUSTOMER
    @PutMapping("{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") long id,
                                                      @RequestBody CustomerDto updatedCustomerDto){
        CustomerDto customerDto = customerService.updateCustomer(id, updatedCustomerDto);
        return ResponseEntity.ok(customerDto);
    }

}
