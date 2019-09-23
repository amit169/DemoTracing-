package com.demo.aop.app.DemoForAOP;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.uae.aop.aspect.TrackTimeAspect;

@Service
public class BusinessService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${userBucket.path}")
    private String userBucketPath;

    public BusinessService() {
    }

    @TrackTimeAspect
    public void doTheWork(){
        logger.info("userBucketPath" + userBucketPath);
       //return "Doing the work...";

    }


}
