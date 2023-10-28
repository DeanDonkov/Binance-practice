package com.binance.demo.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientConfiguration {

        @Value("${data.BASE_URL}")
        private String baseUrl;

        @Bean
        public WebClient getWebClient() {
            return WebClient.builder().baseUrl(baseUrl).build();
        }
}
