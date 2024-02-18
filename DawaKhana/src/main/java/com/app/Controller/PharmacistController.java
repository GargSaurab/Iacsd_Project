package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.PharmacistService;

@RestController
@RequestMapping("/pharmacist")
@CrossOrigin(origins="http://localhost:3000")
public class PharmacistController {

	
	@Autowired
	public PharmacistService pharmSrv;
	
	@GetMapping
	public ResponseEntity<?> listAllPharmacist()
	{
		return ResponseEntity.ok(pharmSrv.getAllPharmacist());
	}
	
//	@PostMapping
//	public ResponseEntity<?> AddPharmacist(PharmacistDto pharmaDto)
//	{
//	    	
//	}
	
}
