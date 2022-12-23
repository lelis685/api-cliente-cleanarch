package br.com.cliente.config;

import br.com.cliente.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.cliente.dataprovider.FindAddressByZipCodeImpl;
import br.com.cliente.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {


    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
                                                           InsertCustomerImpl insertCustomer){

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);

    }


}
