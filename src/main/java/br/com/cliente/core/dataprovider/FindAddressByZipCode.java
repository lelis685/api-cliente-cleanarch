package br.com.cliente.core.dataprovider;

import br.com.cliente.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(String zipCode);

}
