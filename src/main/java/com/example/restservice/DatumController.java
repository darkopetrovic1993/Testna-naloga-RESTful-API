package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatumController {

    // LocalDateTime.now()
    // http://localhost:8080/datum?datum=28-02-2021
    @GetMapping("/datum")
    public Datum datum(@RequestParam(value = "datum") String name) {
        return new Datum(String.format(name));
    }
}
