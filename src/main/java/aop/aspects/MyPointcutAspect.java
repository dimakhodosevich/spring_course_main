package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcutAspect {
    @Pointcut("execution( * aop.UniversityLibrary.get*())")
    public void allGetMethodFromUniversityLibrary(){};
}
