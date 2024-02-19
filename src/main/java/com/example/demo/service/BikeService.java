package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService 
{
	String addBike(Bike b);
	Bike getBike(String engno);
	List<Bike>getAllBikes();
	String updateBike(Bike b);
	String deleteBike(String engno);
}
