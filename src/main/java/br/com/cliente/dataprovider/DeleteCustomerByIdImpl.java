package br.com.cliente.dataprovider;

import br.com.cliente.core.dataprovider.DeleteCustomerById;
import br.com.cliente.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {


    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
