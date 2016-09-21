package net.coderdaily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SunYukun on 2016/9/19.
 */

@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    @RequestMapping("/")
    String home(){
        return "hello boot-press";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class);
    }

}
