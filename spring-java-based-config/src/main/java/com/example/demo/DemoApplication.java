package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Developer;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		
		Developer dev = context.getBean("developer",Developer.class);
		
		dev.code();
		
		Laptop laptop = context.getBean("laptop",Laptop.class);
		laptop.setModel("Dell vastro 55s");
		laptop.setRam(16);
		
		LaptopService lapService = context.getBean("laptopService",LaptopService.class);
		
		lapService.addLaptop(laptop);
		
		System.out.println(lapService.getLaptops());;
	}

}
