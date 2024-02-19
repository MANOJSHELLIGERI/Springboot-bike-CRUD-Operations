package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController  
{

	BikeService bikesrv;

	public BikeController(BikeService bikesrv) {
		super();
		this.bikesrv = bikesrv;
	}        
	
	@PostMapping
	public String addBike(@RequestBody Bike b)
	{
		String rmsg=bikesrv.addBike(b);    
		return rmsg;
	}                                       
	@GetMapping(value = "{engno}")
	public Bike fetchBike(@PathVariable String engno) {
		return bikesrv.getBike(engno);          
	}
	@GetMapping
	public List<Bike> fetchAllbikes(){
		List<Bike> blist=bikesrv.getAllBikes();
		return blist;        
	}   
	@PutMapping
	public String updatebike(@RequestBody Bike b) {
		String msg=bikesrv.updateBike(b);
		return msg;
	}
	@DeleteMapping(value = "{engno}")
	public String deletebike(@PathVariable String engno) {
		String msg=bikesrv.deleteBike(engno);
		return msg;
	}
}

