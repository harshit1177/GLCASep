package com.gl.annotations.service;

import org.springframework.stereotype.Service;

@Service
public class Cups implements IceCream{

	public String getIceCream() {
		return "Cup- Ice Cream";
	}

	@Override
	public int getPrice() {
		return 70;
	}
}
