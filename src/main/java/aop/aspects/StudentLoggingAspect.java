package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Order(10)
public class StudentLoggingAspect {

    @Pointcut("execution(* get*())")
    public void allGetMethodsFromStudentUniversity(){};

    @Before("allGetMethodsFromStudentUniversity()")
    public void beforeAllGetMethodsFromStudentUniversityAdvice(){
        System.out.println("beforeAllGetMethodsFromStudentUniversity: проверка....");
    }

//    @AfterReturning(pointcut = "allGetMethodsFromStudentUniversity()",
//                    returning = "students")
//    public void afterReturningGetMethodsFromStudentUniversityAdvice(JoinPoint joinPoint, List<Student> students){
//        System.out.println("------------------------------------------------------------------");
//        System.out.println("afterReturningGetMethodsFromStudentUniversityAdvice: проверка....");
//        joinPoint.getSignature();
//
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println(methodSignature.getMethod());
//        System.out.println(methodSignature.getReturnType());
//        System.out.println(methodSignature.getName());
//
//        Student student = students.get(0);
//        student.setName("Khodosevich");
//        student.setAge(29);
//        student.setAvgMark(8.5);
//
//        System.out.println("------------------------------------------------------------------");
//    }


//    @AfterThrowing(pointcut = "allGetMethodsFromStudentUniversity()",
//                   throwing = "exception")
//    public void afterExceptionAllGetMethodsFromStudentUniversityAdvice(Throwable exception){
//        System.out.println("Логируем исключение: " + exception);
//    }


    @Around("allGetMethodsFromStudentUniversity())")
    public Object aroundAllGetMethodsFromStudentUniversityAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundAllGetMethodsFromStudentUniversityAdvice: выполнение...");

        return joinPoint.proceed();
    }

}
