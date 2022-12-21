package br.com.cliente.dataprovider;

import br.com.cliente.core.dataprovider.FindAddressByZipCode;
import br.com.cliente.core.domain.Address;
import br.com.cliente.dataprovider.client.FindAddressByZipCodeClient;
import br.com.cliente.dataprovider.client.mapper.AddressResponseMapper;
import br.com.cliente.dataprovider.client.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
