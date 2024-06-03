package com.gl.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.annotations.controller.IceCreamController;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(AnnotationsApplication.class, args);
		IceCreamController iceCreamController = context.getBean(IceCreamController.class);
		
	//	IceCreamController iceCreamController= new IceCreamController();
		System.out.println(iceCreamController.getIceCream());
	
		
		
		
	}
	
	
	

}
