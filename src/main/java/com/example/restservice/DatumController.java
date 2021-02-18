package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatumController {

    @GetMapping("/datum")
    public Datum datum(@RequestParam(value = "name") String name) {
        return new Datum(String.format(name));
    }
}
