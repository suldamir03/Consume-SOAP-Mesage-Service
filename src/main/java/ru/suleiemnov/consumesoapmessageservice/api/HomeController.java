package ru.suleiemnov.consumesoapmessageservice.api;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.suleiemnov.consumesoapmessageservice.wsdl.GetUserRequest;
import ru.suleiemnov.consumesoapmessageservice.wsdl.GetUserResponse;

@Slf4j
@RestController
public class HomeController {
    @Autowired
    private UserClient client;

    @PostMapping("/api")
    public GetUserResponse getUserResponse(@RequestParam("name") String name){
        log.info("Income name: {}", name);

        try {
            JAXBContext context = JAXBContext.newInstance(GetUserRequest.class);

//            URL url = new URL("http://ipsedin:8080/WebServiceBeanService/WebServiceBean?wsdl");
//            QName serviceName = new QName(
//                    "http://ejb.rpt.softcomputer.com/",
//                    "WebServiceBeanService");
//            QName portName = new QName(
//                    "http://ejb.rpt.softcomputer.com/",
//                    "WebServiceBeanPort");
//
//            Service service = Service.create(url, serviceName);
//            Echo ejbService = service.getPort(portName, Echo.class);
//
//            System.out.println(ejbService.echo("lololo"));
//            System.out.println(ejbService.processExCourse(new ExCourse()));

        } catch (JAXBException e) {
            System.out.println("-------Eception------");
            throw new RuntimeException(e);
        }
        return client.getUserResponse(GetUserRequest.builder()
                .name(name)
                .build()
        );
    }
}
