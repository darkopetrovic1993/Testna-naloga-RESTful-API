package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class DatumController {
    @Autowired
    private DatumRepository datumRepository;

    @PostMapping("/datum")
    public Datum createDatum(@RequestBody Datum datum) {
        return datumRepository.save(datum);
    }

}

