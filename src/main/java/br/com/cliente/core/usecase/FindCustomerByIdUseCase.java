package br.com.cliente.core.usecase;

import br.com.cliente.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(String id);

}
