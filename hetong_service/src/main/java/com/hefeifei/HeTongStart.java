package com.hefeifei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HeTongStart {
    public static void main(String[] args) {
        SpringApplication.run(HeTongStart.class,args);
    }
}
