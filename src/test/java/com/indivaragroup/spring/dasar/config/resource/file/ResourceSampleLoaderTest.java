package com.indivaragroup.spring.dasar.config.resource.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResourceSampleLoaderTest {

    @Autowired
    private ResourceSampleLoader resourceSampleLoader;

    @Test
    void resourceSampleLoaderTest() throws Exception {
        resourceSampleLoader.sampleResource();
    }
}
