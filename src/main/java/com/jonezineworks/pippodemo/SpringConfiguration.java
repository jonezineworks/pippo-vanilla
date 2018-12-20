package com..pippodemo;

import com.jonezineworks.pippodemo.service.DemoService;
import com.jonezineworks.pippodemo.service.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public DemoService demoService(){
		return new DemoServiceImpl();
	}
}
