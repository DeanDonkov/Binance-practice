package com.binance.demo.services;

import com.binance.demo.configurations.WebClientConfiguration;
import com.binance.demo.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class binance_api {

    @Autowired
    WebClient web;

    public Price getPriceForTwoAssets(String firstAsset, String secondAsset) {
        return web.get().uri("/api/v3/ticker/price?symbol=" + firstAsset + secondAsset).retrieve().bodyToMono(Price.class).block();
    }

}
