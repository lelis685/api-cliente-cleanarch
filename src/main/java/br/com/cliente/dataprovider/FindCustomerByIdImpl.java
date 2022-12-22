package br.com.cliente.dataprovider;

import br.com.cliente.core.dataprovider.FindCustomerById;
import br.com.cliente.core.domain.Customer;
import br.com.cliente.dataprovider.repository.CustomerRepository;
import br.com.cliente.dataprovider.repository.mapper.CustomerEntityMapper;
import br.com.cliente.entrypoint.controller.mapper.CustomerMapper;
import br.com.cliente.entrypoint.controller.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);

        return customerEntity
                .map(entity-> customerEntityMapper.toCustomer(entity));
    }

}
