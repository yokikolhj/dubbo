package com.shirly;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class GmallOrderServiceConsumerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GmallOrderServiceConsumerApplication.class, args);
	}

}
