package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component
public class Laptop implements Computer{
	
	private int ram;
	
	private String model;
	
	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public void compile() {
		System.out.println("compiling using laptop....");
	}


	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + "]";
	}
	
	

}
