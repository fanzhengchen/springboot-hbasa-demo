package com.xgh.hbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class HbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HbaseApplication.class, args);
    }


}
