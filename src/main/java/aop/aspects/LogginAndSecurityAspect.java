package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAndSecurityAspect {

    @Pointcut("execution(public * get*(..))")
    private void p(){};

    @Before("p()")
    public void beforeGetLogginAdvice(){
        System.out.println("Попытка получить книгу/журнал");
        System.out.println("Проверяем....");
    }

    @Before("p()")
    public void beforeGetSecurityAdvice(){
        System.out.println("Проверка на наличие прав взять книгу/журнал");
        System.out.println("Проверяем....");
    }

}
