package com.binance.demo.services;

import com.binance.demo.models.Price;
import com.binance.demo.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price addPrice(Price price) {
        return priceRepository.save(price);
    }

    public void deletePrice(Price price) {
        priceRepository.delete(price);
    }

    public void deletePriceById(Long id) {
        priceRepository.deleteById(id);
    }

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

}
