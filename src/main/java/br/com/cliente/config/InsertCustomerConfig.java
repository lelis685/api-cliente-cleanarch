package br.com.cliente.config;

import br.com.cliente.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.cliente.dataprovider.FindAddressByZipCodeImpl;
import br.com.cliente.dataprovider.InsertCustomerImpl;
import br.com.cliente.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {


    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
                                                           InsertCustomerImpl insertCustomer,
                                                           SendCpfForValidationImpl sendCpfForValidation){

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);

    }


}
