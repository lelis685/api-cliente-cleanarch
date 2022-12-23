package br.com.cliente.config;

import br.com.cliente.core.usecase.impl.FindCustomerByIdUserCaseImpl;
import br.com.cliente.core.usecase.impl.UpdateCustomerUseCaseImpl;
import br.com.cliente.dataprovider.FindAddressByZipCodeImpl;
import br.com.cliente.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {


    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(FindCustomerByIdUserCaseImpl findCustomerByIdUserCase,
                                                           FindAddressByZipCodeImpl findAddressByZipCode,
                                                           UpdateCustomerImpl updateCustomer) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUserCase, findAddressByZipCode, updateCustomer);
    }


}
