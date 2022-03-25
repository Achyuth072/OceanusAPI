package com.ba.OceanusApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.OceanusApp.model.FishTypeDetails;

@Repository
public interface FishTypeRepo extends JpaRepository<FishTypeDetails, Integer>{
	List<FishTypeDetails> findByFishtype (String fishtype);

}
