package com.gl.annotations.service;

import org.springframework.stereotype.Service;

@Service
public interface IceCream {

	String getIceCream();
	
	int getPrice();
}
