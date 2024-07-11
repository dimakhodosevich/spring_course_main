package aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("universityLibraryBean")
@Scope("singleton")
public class UniversityLibrary extends AbstractLibrary {

//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу в библиотеке университета!!!");

    }

    public void getMagazine() {
        System.out.println("Мы берем журнал в библиотеке университета!!!");
    }



}
