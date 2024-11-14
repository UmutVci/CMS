package com.backend.Adapters.Controllers;

import com.backend.Adapters.dto.CustomerDto;
import com.backend.Application.Services.Impl.CustomerServiceImpl;
import com.backend.Application.Services.Models.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
@Operation(
        operationId = "createCustomer",
        summary = "Create new Customer",
        description = "new Customer created!"
)
    @ApiResponse(
            responseCode = "201",
            description = "Operation completed!"
    )

    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    // GETTING CUSTOMER WITH ID
    @GetMapping("{id}")

    @Operation(
            operationId = "getCustomer",
            summary = "Get the Customer",
            description = "the Customer came!"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Operation completed!"
    )
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") long id){
        CustomerDto customerDto = customerService.getCustomer(id);
        return ResponseEntity.ok(customerDto);
    }
    // GETTING ALL CUSTOMERS
    @GetMapping()
    @Operation(
            operationId = "getAllCustomers",
            summary = "Get all Customers",
            description = "all Customers came!"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Operation completed!"
    )

    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        List<CustomerDto> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }
    // UPDATING CUSTOMER
    @PutMapping("{id}")

    @Operation(
            operationId = "updateCustomer",
            summary = "Update the Customer",
            description = "the Customer updated!"
    )
    @ApiResponse(
            responseCode = "201",
            description = "the Customer updated!"
    )

    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") long id,
                                                      @RequestBody CustomerDto updatedCustomerDto){
        CustomerDto customerDto = customerService.updateCustomer(id, updatedCustomerDto);
        return ResponseEntity.ok(customerDto);
    }
    // DELETING CUSTOMER
    @DeleteMapping("{id}")
    @Operation(
            operationId = "deleteCustomer",
            summary = "Delete Customer",
            description = "the Customer deleted!"
    )
    @ApiResponse(
            responseCode = "200",
            description = "the Customer deleted!"
    )
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id){
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("Customer successfully deleted!");
    }

}
