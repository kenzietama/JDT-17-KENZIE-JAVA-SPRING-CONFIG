package com.indivaragroup.spring.dasar.config.resource.file;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class ResourceSampleLoader implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void sampleResource() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:/media/file/example-resource-read.txt");
        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);
        System.out.println("INI FILE DARI EXAMPLE RESOURCE LOADER");
    }
}
