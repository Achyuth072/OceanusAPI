package com.ba.OceanusApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ba.OceanusApp.model.TrawlingDetails;

@Repository
public interface TrawlingRepo extends JpaRepository<TrawlingDetails, Integer>{
		
	List<TrawlingDetails> findAllByTrawlingNumber(String trawlingNumber);

}
