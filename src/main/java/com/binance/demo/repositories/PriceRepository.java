package com.binance.demo.repositories;

import com.binance.demo.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {

    Price save(Price price);

    void delete(Price entity);

    void deleteById(Long aLong);

    List<Price> findAll();
}
