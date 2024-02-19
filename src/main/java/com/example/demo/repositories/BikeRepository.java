package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>
{

}
