package com.cassandra.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;

public class BootStrapListener implements ApplicationListener<ApplicationReadyEvent>, Ordered{

    private static final Logger LOGGER = LoggerFactory.getLogger(BootStrapListener.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        LOGGER.info("============= CASSANDRA SERVICE STARTED ===============");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
