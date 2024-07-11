package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.*())")
//    private void allMethodFromUniversityLibrary(){};
//
//    @Pointcut("execution(* aop.UniversityLibrary.addMagazine())")
//    private void addMagazineMethodFromUniversityLibrary(){};
//
//    @Pointcut("allMethodFromUniversityLibrary() && !addMagazineMethodFromUniversityLibrary()")
//    private void allMethodWithoutAddMagazineMethodFromUniversityLibrary(){};
//
//
//
//    @Before("allMethodWithoutAddMagazineMethodFromUniversityLibrary()")
//    public void beforeAllMethodFromUniversityLibraryWithoutAddMagazine(){
//        System.out.println("beforeAllMethodFromUniversityLibraryWithoutAddMagazine: writing logging log#super");
//    }










    @Pointcut("execution(* aop.UniversityLibrary.return*())")
    public void allReturnMethodFromUniversityLibrary(){};

    @Pointcut("aop.aspects.MyPointcutAspect.allGetMethodFromUniversityLibrary() || allReturnMethodFromUniversityLibrary()")
    public void allGetAndReturnMethodFromUniversityLibrary(){};


    @Before("aop.aspects.MyPointcutAspect.allGetMethodFromUniversityLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing log#1");
    }

    @Before("allReturnMethodFromUniversityLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing log#2");
    }




}
