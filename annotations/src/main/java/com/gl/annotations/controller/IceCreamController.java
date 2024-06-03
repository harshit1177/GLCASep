package com.gl.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gl.annotations.service.IceCream;

@Controller
public class IceCreamController {

	//create the object of the dependency
	private IceCream iceCream;
	
	
	//constructor injection
	@Autowired
	public IceCreamController(@Qualifier("cups") IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getIceCream() {
		return iceCream.getIceCream();
	}
}
