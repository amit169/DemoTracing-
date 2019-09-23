package com.demo.aop.app.DemoForAOP;

//import com.uae.aop.aspect.LoggingHandler;
//import com.uae.aop.aspect.TrackTimeAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ControllerSample {

@Autowired BusinessService businessService;

    //@TrackTimeAspect
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String callBusinessService(){
         businessService.doTheWork();
        return "Hello World";
    }
}
