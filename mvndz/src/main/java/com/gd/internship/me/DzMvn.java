package com.gd.internship.me;


import com.github.javafaker.Faker;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class DzMvn {
    static Logger logger = Logger.getLogger(DzMvn.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Faker faker = new Faker();
        logger.warn(faker.aviation().METAR());
        logger.info(faker.app().version());
    }
}
