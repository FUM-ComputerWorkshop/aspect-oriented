package com.dotin.aspect.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void calculateSomething() throws InterruptedException {
        Thread.sleep(500 * 2);
        logger.info(getClass().getName());
    }
}
