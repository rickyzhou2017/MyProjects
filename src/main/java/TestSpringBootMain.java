import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouhuiyu on 17/10/31.
 */
@EnableAutoConfiguration
@RestController
public class TestSpringBootMain {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args){

//        Runnable thread = new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.print(".");
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };

//        new Thread(thread).start();


        SpringApplication.run(TestSpringBootMain.class, args);
    }
}
