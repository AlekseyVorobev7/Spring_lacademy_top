package com.test.test.controller;

import com.test.test.model.Exchange;
import com.test.test.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exchanges")
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public ResponseEntity<List<Exchange>> getAllEx() {
        return ResponseEntity.ok(exchangeService.getAllExchange());
    }

    @GetMapping("/{country}")
    public ResponseEntity<List<Exchange>> getExByCountry(@PathVariable String country) {
        return ResponseEntity.ok(exchangeService.getByCountry(country));
    }
    @GetMapping("/founded/{founded}")
    public ResponseEntity<List<Exchange>> getExByFounded(@PathVariable Long founded) {
        return ResponseEntity.ok(exchangeService.getByFounded(founded));
    }
    @PostMapping("/create_exchange")
    @ResponseStatus(HttpStatus.CREATED)
    public Exchange create(@RequestBody Exchange exchange) {
        return exchangeService.create(exchange);
    }
}
