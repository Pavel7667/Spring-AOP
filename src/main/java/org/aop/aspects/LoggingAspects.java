package org.aop.aspects;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspects {

    /**
     * Put signature Into @Before Parameters
     * It will make some action before Method(signature)
     */
    @org.aspectj.lang.annotation.Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("Some Advice Before Method getBook" +
                "from any Classes with samy method signature");
    }

}
