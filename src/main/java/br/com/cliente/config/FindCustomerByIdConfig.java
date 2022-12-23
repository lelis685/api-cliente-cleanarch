package br.com.cliente.config;

import br.com.cliente.core.usecase.impl.FindCustomerByIdUserCaseImpl;
import br.com.cliente.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {


    @Bean
    public FindCustomerByIdUserCaseImpl findCustomerByIdUserCase(FindCustomerByIdImpl findCustomerById){
        return new FindCustomerByIdUserCaseImpl(findCustomerById);
    }


}
