package br.com.cliente.core.usecase;

import br.com.cliente.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
