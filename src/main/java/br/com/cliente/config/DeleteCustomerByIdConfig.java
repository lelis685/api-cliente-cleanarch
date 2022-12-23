package br.com.cliente.config;

import br.com.cliente.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import br.com.cliente.core.usecase.impl.FindCustomerByIdUserCaseImpl;
import br.com.cliente.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {


    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUserCaseImpl findCustomerByIdUserCase,
                                                                   DeleteCustomerByIdImpl deleteCustomerById) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUserCase, deleteCustomerById);
    }


}
