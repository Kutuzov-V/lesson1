package lesson;

import lesson.ab_package.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MediaSoftLesson1 {

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(MediaSoftLesson1.class);

        B b = applicationContext.getBean(B.class);

    }
}
