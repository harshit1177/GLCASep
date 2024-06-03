package com.gl.annotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gl.annotations.service.Cones;
import com.gl.annotations.service.IceCream;

@Configuration
public class AppConfig {

	//it will tell the spring container that the below method
	//will return a object/bean that you have to manage. 
	@Bean
	 public IceCream getIceCreamObject() {
		 return new Cones();
	 }
}
