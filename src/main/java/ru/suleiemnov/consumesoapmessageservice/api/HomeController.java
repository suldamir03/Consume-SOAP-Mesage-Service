package ru.suleiemnov.consumesoapmessageservice.api;

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

        return client.getUserResponse(GetUserRequest.builder()
                .name(name)
                .build()
        );
    }
}
