package com.indivaragroup.spring.dasar.config.resource.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MessageSourceConfigurationTest {
    @Autowired
    private MessageSource messageSource;

    @Test
    void testHelloEnglish() {
        String message = messageSource.getMessage(
                "error.field.messages.name", new Object[]{"test"}, Locale.ENGLISH);
        assertEquals("this name [test] is already exist in database", message);
        System.out.println(message);
    }

    @Test
    void testHelloIndonesian() {
        String message = messageSource.getMessage(
                "error.field.messages.name", new Object[]{"test"}, Locale.of("id","id"));
        assertEquals("nama ini [test] sudah terdaftar di database", message);
        System.out.println(message);
    }
}
