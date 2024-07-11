package aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("publicLibraryBean")
@Scope("singleton")
public class PublicLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("Берем книгу в общественной библиотеке");
    }
}
