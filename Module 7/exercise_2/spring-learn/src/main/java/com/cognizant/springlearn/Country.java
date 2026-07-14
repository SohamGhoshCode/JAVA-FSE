package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger logger = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        logger.info("Country default constructor called");
    }

    public String getCode() {
        logger.info("getCode called");
        return code;
    }

    public void setCode(String code) {
        logger.info("setCode called with: {}", code);
        this.code = code;
    }

    public String getName() {
        logger.info("getName called");
        return name;
    }

    public void setName(String name) {
        logger.info("setName called with: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
