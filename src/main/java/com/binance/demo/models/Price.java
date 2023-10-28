package com.binance.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String symbol;
    String price;

}
