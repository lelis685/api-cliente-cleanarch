package br.com.cliente.core.usecase.impl;

import br.com.cliente.core.dataprovider.FindAddressByZipCode;
import br.com.cliente.core.dataprovider.UpdateCustomer;
import br.com.cliente.core.domain.Address;
import br.com.cliente.core.domain.Customer;
import br.com.cliente.core.usecase.FindCustomerByIdUseCase;
import br.com.cliente.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private FindCustomerByIdUseCase findCustomerByIdUseCase;
    private FindAddressByZipCode findAddressByZipCode;
    private UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAddressByZipCode findAddressByZipCode,
                                     UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
