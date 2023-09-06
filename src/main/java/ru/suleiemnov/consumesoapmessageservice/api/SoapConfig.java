package ru.suleiemnov.consumesoapmessageservice.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@Configuration
public class SoapConfig extends WsConfigurerAdapter {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("ru/suleiemnov/consumesoapmessageservice/wsdl");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate template(){
        WebServiceTemplate template = new WebServiceTemplate();
        template.setMarshaller(marshaller());
        return template;
    }

}
