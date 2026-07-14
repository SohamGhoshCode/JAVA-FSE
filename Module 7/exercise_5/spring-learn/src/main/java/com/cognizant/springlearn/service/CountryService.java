package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {
        logger.info("Start getCountry with code: {}", code);
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Map<String, Country> countryMap = context.getBeansOfType(Country.class);
        Country result = null;
        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(code)) {
                result = entry.getValue();
                break;
            }
        }
        logger.info("End getCountry, result: {}", result);
        return result;
    }
}
