package spring_annotation;


import org.springframework.stereotype.Component;

 @Component("catt")
public class Catt implements Pet {

    public Catt() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("myo myo");
    }

    public void init(){
        System.out.println("Cat class: init metod");
    }

    public void destroy(){
        System.out.println("Cat class: destroy metod");
    }
}

