package com.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BugRun {
    public static void main(String[] args) {

        SpringApplication.run(BugRun.class,args);
    }
}
