package com.zhu.zhuapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZhuapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuapiInterfaceApplication.class, args);
    }

}
