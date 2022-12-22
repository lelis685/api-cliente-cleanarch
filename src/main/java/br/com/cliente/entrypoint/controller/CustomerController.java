package br.com.cliente.entrypoint.controller;

import br.com.cliente.core.domain.Customer;
import br.com.cliente.core.usecase.FindCustomerByIdUseCase;
import br.com.cliente.core.usecase.InsertCustomerUseCase;
import br.com.cliente.core.usecase.UpdateCustomerUseCase;
import br.com.cliente.entrypoint.controller.mapper.CustomerMapper;
import br.com.cliente.entrypoint.controller.request.CustomerRequest;
import br.com.cliente.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private CustomerMapper customerMapper;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id,
                                       @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }






}
