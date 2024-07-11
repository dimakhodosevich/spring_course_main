package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniversityLibrary.*())")
    private void allMethodFromUniversityLibrary(){};

    @Pointcut("execution(* aop.UniversityLibrary.addMagazine())")
    private void addMagazineMethodFromUniversityLibrary(){};

    @Pointcut("allMethodFromUniversityLibrary() && !addMagazineMethodFromUniversityLibrary()")
    private void allMethodWithoutAddMagazineMethodFromUniversityLibrary(){};



    @Before("allMethodWithoutAddMagazineMethodFromUniversityLibrary()")
    public void beforeAllMethodFromUniversityLibraryWithoutAddMagazine(){
        System.out.println("beforeAllMethodFromUniversityLibraryWithoutAddMagazine: writing logging log#super");
    }









//    @Pointcut("execution( * aop.UniversityLibrary.get*())")
//    private void allGetMethodFromUniversityLibrary(){};
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodFromUniversityLibrary(){};
//
//    @Pointcut("allGetMethodFromUniversityLibrary() || allReturnMethodFromUniversityLibrary()")
//    private void allGetAndReturnMethodFromUniversityLibrary(){};
//
//
//    @Before("allGetMethodFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log#1");
//    }
//
//    @Before("allReturnMethodFromUniversityLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log#2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("allGetAndReturnMethodFromUniversityLibrary: writing log#3");
//    }


}
