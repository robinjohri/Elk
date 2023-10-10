package com.elkstack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.elkstack.feign.Feign;


@RestController
public class UserController 
{
	@Autowired
	Feign feign;

	Logger logger= LoggerFactory.getLogger(UserController.class);
	
	//Logger logger= LoggerFactory.getLogger("Robins Class");
	@GetMapping("/add/{item_id}")
  public String addUsersItem(@PathVariable("item_id") String item_id)
  {
	/** NEW CODE CHANGE DONE ON 4th October causing the Error **/
	 if( item_id.equals("5"))
	 {
		 logger.error("WRONG INPUT ENTERED. Please enter a digit other than 5");
		 return "WRONG INPUT ENTERED.Failed to add item ";
	 }
	 /** NEW CODE CHANGE DONE ON 4th October causing the Error **/
	 
	 else
	 {
		feign.addToCart(item_id);
		logger.info("Call to Cart Service was successful");
		//logger.info("success reached here");
		 return "Item with id: " + item_id  + " selected to add in cart" ;
	 }
	 
	 
  }

}
;