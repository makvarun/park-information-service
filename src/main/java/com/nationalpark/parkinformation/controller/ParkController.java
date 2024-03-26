package com.nationalpark.parkinformation.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ParkController {

    @GetMapping("/park")
    public String getPark() {
        String uri = "https://developer.nps.gov/api/v1/parks?api_key=";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);

        return result;
    }

}
