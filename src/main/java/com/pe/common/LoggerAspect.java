/**
 * 
 */
package com.pe.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author vaibhav.datta
 *
 */
@Aspect
@Component
public class LoggerAspect {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);
    
/*    @Before("execution(* com.pe.* && args(sampleName)")
    public void beforeOperation(final JoinPoint joinPoint) {
        LOGGER.info("Entering method " + joinPoint.getSignature().getName() + "...");
    }
    
    @After("execution(* com.pe.* && args(sampleName)")
    public void afterOperation(final JoinPoint joinPoint) {
        LOGGER.info("Exitinhg method " + joinPoint.getSignature().getName() + "...");
    }*/

}
