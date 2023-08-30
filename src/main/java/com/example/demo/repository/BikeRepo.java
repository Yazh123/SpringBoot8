package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bike;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer> {
  
	 @Query(value="select * from Bike where year=:s",nativeQuery=true)
	   public List<Bike> getbikebyyear(@Param("s") int year);
	 
	 @Query(value="select * from Bike where year=:yr or bikename=:name",nativeQuery=true)
	   public List<Bike> getbikebyParam(@Param("yr") int year, @Param("name") String bikename );
}
