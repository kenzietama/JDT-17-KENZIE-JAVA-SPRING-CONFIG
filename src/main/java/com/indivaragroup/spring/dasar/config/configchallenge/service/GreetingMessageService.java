package com.indivaragroup.spring.dasar.config.configchallenge.service;

import com.indivaragroup.spring.dasar.config.configchallenge.config.StoreProperties;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class GreetingMessageService {

    private final MessageSource messageSource;
    private final StoreProperties storeProperties;

    public GreetingMessageService(
            MessageSource messageSource,
            StoreProperties storeProperties
    ) {
        this.messageSource = messageSource;
        this.storeProperties = storeProperties;
    }

    public String getGreeting(Locale locale) {
        // TODO:
        // return message store.greeting menggunakan messageSource
        return messageSource.getMessage("store.greeting", new Object[]{storeProperties.getName(),storeProperties.getCity()}, locale);
    }

    public String getStatus(Locale locale) {
        // TODO:
        // return store.status.active / inactive berdasarkan nilai properti active
        return messageSource.getMessage(Boolean.TRUE.equals(storeProperties.getActive()) ? "store.status.active" : "store.status.inactive", new Object[]{storeProperties.getActive()}, locale);
    }
}

