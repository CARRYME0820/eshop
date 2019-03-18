import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestClass {
    public static void main(String[] args) {
        System.out.println("开工啦");

        SpringApplication.run(TestClass.class,args);
    }
}
