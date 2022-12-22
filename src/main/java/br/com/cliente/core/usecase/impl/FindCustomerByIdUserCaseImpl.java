package br.com.cliente.core.usecase.impl;

import br.com.cliente.core.dataprovider.FindCustomerById;
import br.com.cliente.core.domain.Customer;
import br.com.cliente.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUserCaseImpl implements FindCustomerByIdUseCase {

    private FindCustomerById findCustomerById;

    public FindCustomerByIdUserCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
