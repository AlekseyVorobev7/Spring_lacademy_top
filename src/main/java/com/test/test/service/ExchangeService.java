package com.test.test.service;


import com.test.test.model.Exchange;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExchangeService {
    private Map<Long, Exchange> exchanges = new HashMap<>();
    private Long nextId = 1L;

}
