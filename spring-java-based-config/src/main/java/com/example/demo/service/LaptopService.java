package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;
import com.example.demo.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;

	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		System.out.println("added laptop");
		laptopRepository.save(laptop);
	}
	
	public boolean isGoodForProgramming(Laptop laptop) {
		if(laptop.getRam()>8) {
			return true;
		}
		return false;
	}

	public List<Laptop> getLaptops() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	

}
