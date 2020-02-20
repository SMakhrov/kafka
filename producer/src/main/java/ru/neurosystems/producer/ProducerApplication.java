package ru.neurosystems.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.neurosystems.producer.kafka.MessageProducer;
import ru.neurosystems.producer.restclient.services.ApiService;
import ru.neurosystems.producer.restclient.services.ApiServiceImpl;

@EnableScheduling
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProducerApplication.class, args);

        MessageProducer producer = context.getBean(MessageProducer.class);
        ApiService service = context.getBean(ApiServiceImpl.class);

        service.getData(3).forEach(producer::sendMessage);
    }

}
