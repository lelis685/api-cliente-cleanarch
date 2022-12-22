package br.com.cliente.core.dataprovider;

import br.com.cliente.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(String id);

}
