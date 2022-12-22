package br.com.cliente.core.usecase;

import br.com.cliente.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
