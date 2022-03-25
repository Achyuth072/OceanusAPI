package com.ba.OceanusApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.OceanusApp.model.ColdStoDets;

@Repository
public interface ColdStoRepo extends JpaRepository<ColdStoDets, Integer> {

}
