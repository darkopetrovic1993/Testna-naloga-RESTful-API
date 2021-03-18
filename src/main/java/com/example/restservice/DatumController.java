package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class DatumController {
    @Autowired
    private DatumRepository DatumRepository;

//    http://localhost:8080/api/v1          ---> error (type=Not Found, status=404)
//    http://localhost:8080/datum           ---> error (type=Not Found, status=404)
//    http://localhost:8080/api/v1/datum    ---> error (type=Bad Request, status=400)
//    PostMapping ali GetMapping
//    Ali uporabim: public Datum datum(@RequestParam(value = "datum") String name) {return new Datum(String.format(name));
//    Kaj naredi @RequestBody in kaj naredi @RequestParam?
    @PostMapping ("/datum")
    public Datum createDatum(@RequestBody Datum datum) {
        return DatumRepository.save(datum);
    }
}

