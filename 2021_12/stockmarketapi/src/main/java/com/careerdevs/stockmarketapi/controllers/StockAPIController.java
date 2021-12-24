package com.careerdevs.stockmarketapi.controllers;

import com.careerdevs.stockmarketapi.models.StockAPIModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/stocks")
public class StockAPIController {

    @Autowired
    private Environment environment;
    
    @GetMapping("/ibm")
    public StockAPIModel stockApiInfo(RestTemplate restTemplate) {
        String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=" + environment.getProperty("stock_api_key");

        StockAPIModel model = restTemplate.getForObject(url, StockAPIModel.class);

        return model;
    }

}
