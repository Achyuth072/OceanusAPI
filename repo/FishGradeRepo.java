package com.ba.OceanusApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.OceanusApp.model.FishGradeDets;

@Repository
public interface FishGradeRepo extends JpaRepository<FishGradeDets, Integer>{
	List<FishGradeDets> findAllByFishcategory (String fishcategory);

}
