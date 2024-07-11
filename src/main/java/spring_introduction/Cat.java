package spring_introduction;

public class Cat implements Pet{
    public Cat() {
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
