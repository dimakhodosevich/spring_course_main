package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

//        PublicLibrary library1 = context.getBean("publicLibraryBean", PublicLibrary.class);
        UniversityLibrary library2 = context.getBean("universityLibraryBean", UniversityLibrary.class);


        library2.getMagazine();
        library2.getBook();
        library2.returnMagazine();
        library2.returnBook();
        library2.addBook();
        library2.addMagazine();



        context.close();
    }
}
