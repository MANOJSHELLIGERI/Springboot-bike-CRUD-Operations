package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike 
{
	@Id
	String engno;
	String brand;
	int cost;
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	public Bike(String engno, String brand, int cost) {
		super();
		this.engno = engno;
		this.brand = brand;
		this.cost = cost;
	}
	public String getEngno() {
		return engno;
	}
	public void setEngno(String engno) {
		this.engno = engno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [engno=" + engno + ", brand=" + brand + ", cost=" + cost + "]";
	}


}
