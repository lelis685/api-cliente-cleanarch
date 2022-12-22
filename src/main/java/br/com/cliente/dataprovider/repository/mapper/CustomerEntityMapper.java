package br.com.cliente.dataprovider.repository.mapper;

import br.com.cliente.core.domain.Customer;
import br.com.cliente.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
