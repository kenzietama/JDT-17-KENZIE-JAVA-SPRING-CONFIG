package com.indivaragroup.spring.dasar.config.configchallenge.config;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "store")
@Component
@RequiredArgsConstructor
@Getter
@Setter
public class StoreProperties {
    @NotBlank
    private String name;
    @NotBlank
    private String city;
    private String currency;
    @Min(1)
    private Integer maxDailyOrder;
    private Boolean active;

//     TODO: Generate getter & setter
}

