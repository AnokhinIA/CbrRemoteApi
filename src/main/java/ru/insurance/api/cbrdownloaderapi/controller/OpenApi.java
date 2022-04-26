package ru.insurance.api.cbrdownloaderapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OpenApi {

    @GetMapping("/getinsurers")
    public String getInsurers(@RequestParam String initiator) {

        String result = initiator + "  | Это ответ микросервиса, все работает, аспект записывает log" ;
         return result;
    }

}
