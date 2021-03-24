package com.example.restservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class DatumController {
    @Autowired
    private DatumRepository datumRepository;

    @GetMapping("datum")
    public List<Datum> getAllDatumi() {
        return this.datumRepository.findAll();
    }

//    http://localhost:8080/api/v1          ---> error (type=Not Found, status=404)
//    http://localhost:8080/datum           ---> error (type=Not Found, status=404)
//    http://localhost:8080/api/v1/datum    ---> error (type=Bad Request, status=400)
//    PostMapping ali GetMapping
//    Ali uporabim: public Datum datum(@RequestParam(value = "datum") String name) {return new Datum(String.format(name));
//    Kaj naredi @RequestBody in kaj naredi @RequestParam?
    @PostMapping ("datum")
    public Datum createDatum(@Valid @RequestBody Datum datum) {
        return this.datumRepository.save(datum);
    }
}

