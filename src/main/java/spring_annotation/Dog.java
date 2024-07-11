package spring_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("wow wow");
    }

//    @PostConstruct
    public void init(){
        System.out.println("Dog class: init metod");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("Dog class: destroy metod");
    }
}
