package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repositories.BikeRepository;

@Service
public class BikeServiceImplements implements BikeService 
{
     BikeRepository bkrepo;

	public BikeServiceImplements(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String addBike(Bike b)
	{
		bkrepo.save(b);
		return "Bike is Added";
	}

	@Override
	public Bike getBike(String engno) {
		return bkrepo.findById(engno).get();
	}

	@Override
	public List<Bike> getAllBikes() {
		List<Bike> blist=bkrepo.findAll();
		
		return blist;
	}

	@Override
	public String updateBike(Bike b) {
		bkrepo.save(b);
		return "bike object is updated";
	}

	@Override
	public String deleteBike(String engno) {
		bkrepo.deleteById(engno);
		return "bike object is deleted";
	}
     
     
}
