package lesson.config;


import lesson.ab_package.A;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ConfigCore {
    @Bean
    public A a(){
        return new A();
    }
}
