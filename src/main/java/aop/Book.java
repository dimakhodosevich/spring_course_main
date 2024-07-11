package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bookBean")
@Scope("prototype")
@PropertySource("classpath*:application.properties")
public class Book {

    @Value("${book.name}")
    private String bookName;


    public String getBookName(){
        return this.bookName;
    }
}
