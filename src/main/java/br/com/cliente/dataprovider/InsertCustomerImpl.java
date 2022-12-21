package br.com.cliente.dataprovider;

import br.com.cliente.core.dataprovider.InsertCustomer;
import br.com.cliente.core.domain.Customer;
import br.com.cliente.dataprovider.repository.CustomerRepository;
import br.com.cliente.dataprovider.repository.entity.CustomerEntity;
import br.com.cliente.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
