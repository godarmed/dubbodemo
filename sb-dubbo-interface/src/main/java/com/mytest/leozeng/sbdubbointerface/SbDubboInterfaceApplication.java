package com.mytest.leozeng.sbdubbointerface;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SbDubboInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbDubboInterfaceApplication.class, args);
    }

}
