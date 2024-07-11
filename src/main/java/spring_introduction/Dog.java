package spring_introduction;

public class Dog implements Pet{
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

    public void init(){
        System.out.println("Dog class: init metod");
    }

    public void destroy(){
        System.out.println("Dog class: destroy metod");
    }
}
