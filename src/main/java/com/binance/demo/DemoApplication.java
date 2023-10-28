package com.binance.demo;

import com.binance.demo.models.Price;
import com.binance.demo.services.PriceService;
import com.binance.demo.services.binance_api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static java.lang.Integer.parseInt;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	}
}
