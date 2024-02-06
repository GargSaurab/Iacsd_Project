package com.app.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@Controller+@ResponseBody


public class TestController {
	
	public TestController() {
		System.out.println("in ctor of"+getClass());

	}
	
	//http://host:port/test, method=GET
	//resp:List<Integer>
	@GetMapping
	public List<Integer>testMe()
	{
		System.out.println("in test me");
		return List.of(1,2,3,4,5);
	}
	
	//TestControllerk -->@ResponseBody List<Integer>-->
	//SC uses Jackson to martial JAVA-->sent to Rest clnt
	
}
