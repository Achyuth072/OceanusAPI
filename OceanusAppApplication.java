package com.ba.OceanusApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.ba.OceanusApp.dto")
public class OceanusAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OceanusAppApplication.class, args);
	}

}
