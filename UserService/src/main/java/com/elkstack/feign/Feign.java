package com.elkstack.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CartService")
public interface Feign
{
	@GetMapping("/addToCart/{item_id}")
	public String addToCart(@PathVariable("item_id") String item_id);
	
	
}
