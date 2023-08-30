package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.BikeService;

@RestController
public class ApiController {
    @Autowired
    BikeService bs;
    
    @PostMapping("/")
	public List<Bike> addDet(@RequestBody List<Bike> c)
	{
		return bs.saveninfo(c);
	}
    
    @GetMapping("/year/{year}")
	 public List<Bike> getown(@PathVariable int year)
	 {
		 return bs.getyears(year);
	 }
    
    @GetMapping("/year/{year}/bikeName/{bikename}")
	 public List<Bike> getco(@PathVariable int year,@PathVariable String bikename)
	 {
		 return bs.gettype(year, bikename);
	 }
}
