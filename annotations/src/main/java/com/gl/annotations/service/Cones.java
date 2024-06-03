package com.gl.annotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Cones implements IceCream{
	
	public String getIceCream() {
		return "Cone- Ice Cream";
	}

	@Override
	public int getPrice() {
		return 100;
	}

}
