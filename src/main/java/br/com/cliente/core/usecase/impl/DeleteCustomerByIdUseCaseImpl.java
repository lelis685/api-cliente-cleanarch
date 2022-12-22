package br.com.cliente.core.usecase.impl;

import br.com.cliente.core.dataprovider.DeleteCustomerById;
import br.com.cliente.core.usecase.DeleteCustomerByIdUseCase;
import br.com.cliente.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private FindCustomerByIdUseCase findCustomerByIdUseCase;
    private DeleteCustomerById deleteCustomer;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                         DeleteCustomerById deleteCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomer = deleteCustomer;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomer.delete(id);
    }
}
