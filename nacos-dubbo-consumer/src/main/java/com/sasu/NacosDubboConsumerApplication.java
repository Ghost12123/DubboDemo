package com.sasu;

import com.sasu.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NacosDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboConsumerApplication.class, args);
    }

   /* @Reference(version = "${dubbo.service.version}")
    private HelloService helloService;

    @Bean
    public ApplicationRunner runner() {
        return new ApplicationRunner() {
            public void run(ApplicationArguments args) throws Exception {
                System.out.println(helloService.sayHello("consumer"));
            }
        };
    }*/
}
