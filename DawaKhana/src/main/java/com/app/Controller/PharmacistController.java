package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Authentication;
import com.app.dto.PharmacistDto;
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
	
	@GetMapping("/{Id}")
	public ResponseEntity<?> getById(String Id)
	{
	      return ResponseEntity.ok(pharmSrv.getPharmacistById(Id));	
	}
	
	@PostMapping
	public ResponseEntity<?> AddPharmacist(@RequestBody PharmacistDto pharmaDto)
	{
	    	System.out.println("in Pharmacist body"+ pharmaDto);
		
	    	pharmSrv.addPharmacist(pharmaDto);
	    	
		   return ResponseEntity
				   .status(HttpStatus.CREATED)
				   .build();
	    	
	}
	
	@PutMapping
	public ResponseEntity<?> updatePharmacist(@RequestBody PharmacistDto pharmaDto)
	{
		pharmSrv.updatePharmacist(pharmaDto);
		
		return ResponseEntity
				.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> deletePharmacist(@RequestBody Long Id)
	{
		return ResponseEntity.ok(pharmSrv.deletePharmacist(Id));
	}
	
	@PostMapping("/auth")
	public ResponseEntity<?> AuthenticatePharmacist(@RequestBody Authentication auth)
	{
		String id=auth.getId();
		String pass=auth.getPassword();
		
		System.out.println(id);
         System.out.println(pass);
		
		boolean flag=pharmSrv.getAuthenticate(id,pass);
		
		System.out.println(flag);
		
		return ResponseEntity.ok(flag);
	}
	
}
