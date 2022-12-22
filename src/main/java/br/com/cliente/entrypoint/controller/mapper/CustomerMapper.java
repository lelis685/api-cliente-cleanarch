package br.com.cliente.entrypoint.controller.mapper;

import br.com.cliente.core.domain.Customer;
import br.com.cliente.dataprovider.repository.entity.CustomerEntity;
import br.com.cliente.entrypoint.controller.request.CustomerRequest;
import br.com.cliente.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
