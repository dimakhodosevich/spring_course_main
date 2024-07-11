package spring_annotation;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath*:application.properties")
//@ComponentScan("spring_annotation")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet cattBean() {
        System.out.println("catBean from Myconfig");
        return new Catt();
    }

    @Bean
    public Personn personnBean() {
        return new Personn(cattBean());
    }
}
