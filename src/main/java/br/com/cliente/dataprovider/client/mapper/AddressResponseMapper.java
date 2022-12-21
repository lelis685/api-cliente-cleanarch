package br.com.cliente.dataprovider.client.mapper;

import br.com.cliente.core.domain.Address;
import br.com.cliente.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
