package br.com.cliente.entrypoint.consumer;

import br.com.cliente.core.domain.Customer;
import br.com.cliente.core.usecase.UpdateCustomerUseCase;
import br.com.cliente.entrypoint.consumer.mapper.CustomerMessageMapper;
import br.com.cliente.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {


    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validation", groupId = "lelis")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }


}
