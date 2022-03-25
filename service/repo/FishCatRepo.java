package com.ba.OceanusApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.OceanusApp.model.FishCatDets;

@Repository
public interface FishCatRepo extends JpaRepository<FishCatDets, Integer>{
	List<FishCatDets> findAllByFishtype(String fishtype);

}
