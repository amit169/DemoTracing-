package com.demo.aop.app.DemoForAOP.aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.aop.app.DemoForAOP.BusinessService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAopSpringBootTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BusinessService business1;

    @Test
    public void invokeAOPStuff() {
        business1.doTheWork();
        logger.info("******************************invokeAOPStuff TEST***************");
    }
}