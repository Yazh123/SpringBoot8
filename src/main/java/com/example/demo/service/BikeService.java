package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {
   @Autowired
   BikeRepo br;
   
   public List<Bike> saveninfo(List<Bike> ss) {
   	return (List<Bike>)br.saveAll(ss);
   }
   
   public List<Bike> getyears(int o){
   	return br.getbikebyyear(o);
   }
   
   public List<Bike> gettype (int o, String name){
   	return br.getbikebyParam(o,name);
   }
}
