package br.com.cliente.dataprovider.repository.entity;

import br.com.cliente.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String name;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;

}
