package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Laptop;

@Repository
public class LaptopRepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Laptop laptop) {
		String insertquery = "Insert into laptop (ram, model) values (?,?)";
		int row = jdbcTemplate.update(insertquery, laptop.getRam(), laptop.getModel());
		System.out.println(row + " : new row added to laptop db");
		
	}

	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		String selectquery = "select * from laptop";
		RowMapper<Laptop> mapper = (rs, rowNum) -> {
				// TODO Auto-generated method stub
				Laptop lap = new Laptop();
				lap.setRam(rs.getInt("ram"));// ram is the column name
				lap.setModel(rs.getString("model")); //model is the column name
				return lap;
		};
		List<Laptop> list = jdbcTemplate.query(selectquery, mapper);
		return list;
		
	}

}
