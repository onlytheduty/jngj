package com.junengguoji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@MapperScan("com.junengguoji.dao")
@SpringBootApplication
public class JunengguojiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JunengguojiApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(JunengguojiApplication.class);
	}
	
}
