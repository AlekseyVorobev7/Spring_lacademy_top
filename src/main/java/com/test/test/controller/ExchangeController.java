package com.test.test.controller;

import com.test.test.model.Exchange;
import com.test.test.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exchanges")
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public ResponseEntity<List<Exchange>> getAllEx() {
        return ResponseEntity.ok(exchangeService.getAllExchanges());
    }

    @GetMapping("/{country}")
    public ResponseEntity<List<Exchange>> getExByCountry(@PathVariable String country) {
        return ResponseEntity.ok(exchangeService.getExchangesByCountry(country));
    }



}
