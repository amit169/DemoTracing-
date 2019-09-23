package com.demo.aop.app.DemoForAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Configuration
public class RequestLogAspect {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping) && execution(public * *(..))")

    public Object log(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes())
                .getRequest();

        Object value;

        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            log.info(
                    "{} {} from {}",
                    request.getMethod(),
                    request.getRequestURI(),
                    request.getRemoteAddr(),
                    request.getHeader("user-id"));
        }

        return value;
    }

}
