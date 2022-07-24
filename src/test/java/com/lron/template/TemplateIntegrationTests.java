package com.lron.template;

import org.testcontainers.containers.PostgreSQLContainer;

abstract class TemplateIntegrationTests {

    private static final String IMAGE_VERSION = "postgres:11.1";
    private static PostgreSQLContainer container;

    static {
        if (container == null) {
            container = new PostgreSQLContainer(IMAGE_VERSION);
        }
        container.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }
}
