package com.dotin.aspect.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void calculateSomething(){
        logger.info(getClass().getName());
    }
}
