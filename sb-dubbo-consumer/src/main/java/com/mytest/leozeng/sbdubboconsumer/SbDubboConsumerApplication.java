package com.mytest.leozeng.sbdubboconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SbDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbDubboConsumerApplication.class, args);
    }

}
