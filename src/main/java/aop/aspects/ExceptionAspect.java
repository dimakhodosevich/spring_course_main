package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionAspect {

    @Before("aop.aspects.MyPointcutAspect.allGetMethodFromUniversityLibrary()")
    public void beforeGetExceptionAdvice(){
        System.out.println("beforeGetExceptionAdvice: writing log#2");
    }
}
