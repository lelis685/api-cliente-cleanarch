package br.com.cliente.core.usecase.impl;

import br.com.cliente.core.dataprovider.FindAddressByZipCode;
import br.com.cliente.core.dataprovider.InsertCustomer;
import br.com.cliente.core.dataprovider.SendCpfForValidation;
import br.com.cliente.core.domain.Customer;
import br.com.cliente.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private FindAddressByZipCode findAddressByZipCode;
    private InsertCustomer insertCustomer;
    private SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer, SendCpfForValidation sendCpfForValidation) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
