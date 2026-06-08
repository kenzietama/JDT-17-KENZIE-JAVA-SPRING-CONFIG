package com.indivaragroup.spring.dasar.config.configchallenge.runner;

import com.indivaragroup.spring.dasar.config.configchallenge.service.GreetingMessageService;
import com.indivaragroup.spring.dasar.config.configchallenge.service.ResourceReaderService;
import com.indivaragroup.spring.dasar.config.configchallenge.service.StoreInfoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements CommandLineRunner {

    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    public AppRunner(
            StoreInfoService storeInfoService,
            ResourceReaderService resourceReaderService,
            GreetingMessageService greetingMessageService
    ) {
        this.storeInfoService = storeInfoService;
        this.resourceReaderService = resourceReaderService;
        this.greetingMessageService = greetingMessageService;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO:
        // 1. Print banner
        System.out.println(resourceReaderService.readBanner());
        // 2. Print store info
        storeInfoService.print(Locale.ENGLISH);
        // 3. Print greeting EN
        System.out.println("[EN]" + greetingMessageService.getGreeting(Locale.ENGLISH));
        // 4. Print greeting ID
        System.out.println("[ID]" + greetingMessageService.getGreeting(Locale.of("id", "id")));
    }
}

