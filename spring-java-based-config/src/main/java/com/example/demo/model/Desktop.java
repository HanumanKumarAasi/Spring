package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

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
		// TODO Auto-generated method stub
		System.out.println("compiling using desktop....");
	}
	
	@Override
	public String toString() {
		return "Desktop [ram=" + ram + ", model=" + model + "]";
	}

}
