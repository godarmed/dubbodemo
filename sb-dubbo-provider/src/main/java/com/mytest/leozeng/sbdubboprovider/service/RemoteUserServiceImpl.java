package com.mytest.leozeng.sbdubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mytest.leozeng.sbdubbointerface.service.RemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * dubbo 服务service
 *
 * @author DUCHONG
 * @since 2018-07-03 18:29
 **/
@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = RemoteService.class)
@Slf4j
public class RemoteUserServiceImpl implements RemoteService {
    @Override
    public String sayHello(String name) {
        log.info("hello:[{}]",name);
        return "Hello "+name;
    }
}
