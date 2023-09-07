package ru.suleiemnov.consumesoapmessageservice.api;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.suleiemnov.consumesoapmessageservice.wsdl.GetUserRequest;
import ru.suleiemnov.consumesoapmessageservice.wsdl.GetUserResponse;
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserClient extends WebServiceGatewaySupport {


    public GetUserResponse getUserResponse(GetUserRequest request){
        log.info("UserClient getUserResponse method");
        log.info("request: {}", request);
        GetUserResponse response =(GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:8080/ws", request,
                new SoapActionCallback("http://sdr.com/spring-soap-example"));
        log.info("Response successfully come! ");
        return response;
    }
}
