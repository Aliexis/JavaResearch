package org.petrlLi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Haiyan Li
 * @Time 2017/9/16
 */
@SpringBootApplication(scanBasePackages = "org.petrlLi.cloud")
@ImportResource("classpath:applicationContext.xml")
public class JavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaApplication.class, args);
    }
}
