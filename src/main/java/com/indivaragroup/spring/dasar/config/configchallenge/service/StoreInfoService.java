package com.indivaragroup.spring.dasar.config.configchallenge.service;

import com.indivaragroup.spring.dasar.config.configchallenge.config.StoreProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class StoreInfoService {
    private final StoreProperties storeProperties;
    private final GreetingMessageService greetingMessageService;

    public void print(Locale locale) {
        System.out.println("Store Name      : " + storeProperties.getName());
        System.out.println("Store City      : " + storeProperties.getCity());
        System.out.println("Currency        : " + storeProperties.getCurrency());
        System.out.println("Max Daily Order : " + storeProperties.getMaxDailyOrder());
        System.out.println("Active          : " + greetingMessageService.getStatus(locale));
    }
}
