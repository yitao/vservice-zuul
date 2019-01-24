package com.vservice.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 应用启动类
 * Created by yitao on 2019/1/24.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@EnableHystrix
//@EnableHystrixDashboard
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
