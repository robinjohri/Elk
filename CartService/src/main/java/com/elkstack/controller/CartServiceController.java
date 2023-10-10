package com.elkstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartServiceController 
{

	@GetMapping("/addToCart/{item_id}")
	public String addToCart(@PathVariable("item_id") String item_id)
	{
		System.out.println("Inside cart Service");
		return "Item with id : " + item_id+ "added to cart";
		
	}
}
