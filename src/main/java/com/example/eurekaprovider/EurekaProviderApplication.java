package com.example.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供eureka-provider进行注册测试
 * <p>
 * https://blog.csdn.net/hanchao5272/article/details/80464087
 * https://www.cnblogs.com/grasp/p/9258811.html
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

}
