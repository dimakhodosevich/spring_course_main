package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Pointcut("aop.aspects.MyPointcutAspect.allGetMethodFromUniversityLibrary() || " +
                "aop.aspects.LoggingAspect.allReturnMethodFromUniversityLibrary()")
    private void allGetAndReturnMethodFromUniversityLibrary(){};


    @Before("allGetAndReturnMethodFromUniversityLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("allGetAndReturnMethodFromUniversityLibrary: writing log#3");
    }

}
