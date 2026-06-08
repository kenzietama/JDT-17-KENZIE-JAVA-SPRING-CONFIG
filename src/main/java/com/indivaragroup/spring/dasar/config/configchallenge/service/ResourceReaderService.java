package com.indivaragroup.spring.dasar.config.configchallenge.service;

import jakarta.annotation.PostConstruct;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class ResourceReaderService {

    private final ResourceLoader resourceLoader;

    public ResourceReaderService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public String readBanner() throws IOException {
        // TODO:
        // 1. Load file "classpath:banner-store.txt"
            Resource resource = resourceLoader.getResource("classpath:banner-store.txt");
        // 2. Baca isi file
            String content = resource.getContentAsString(StandardCharsets.UTF_8);
        // 3. Return sebagai String
            return content;
    }
}
