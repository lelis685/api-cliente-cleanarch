package br.com.cliente.dataprovider.repository;

import br.com.cliente.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
