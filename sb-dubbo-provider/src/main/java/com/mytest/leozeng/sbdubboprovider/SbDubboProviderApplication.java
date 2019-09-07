package com.mytest.leozeng.sbdubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SbDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbDubboProviderApplication.class, args);
    }

}
