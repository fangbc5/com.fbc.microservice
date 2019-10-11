import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @ClassName Start
 * @Author fangbc
 * @Date 2019/1/4 18:35
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan("com.fbc.ms.mail")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
