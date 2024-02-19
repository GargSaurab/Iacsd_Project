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

import com.app.dto.DistributorDto;
import com.app.service.DistributorService;

@RestController
@RequestMapping("/distributor")
@CrossOrigin(origins="http://localhost:3000")
public class DistributorController {
	
	@Autowired
	 DistributorService disSrv;
	
	@PostMapping
	public ResponseEntity<?> addDistributor(@RequestBody DistributorDto dist)
	{
		System.out.println("Distributor "+dist);
		
		disSrv.addDistributor(dist);
		
		return ResponseEntity.status(HttpStatus.CREATED)
			   .build();
	}

	@GetMapping
	public ResponseEntity<?> getAllDistributor()
	{
		System.out.println("In getAllDistributor Method");
		return ResponseEntity.ok(disSrv.getAllDistributor());
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<?> getDistributor(Integer Id)
	{
		return ResponseEntity.ok(disSrv.getById(Id));
	}
	
	@DeleteMapping
	public ResponseEntity<?> deletDistributor(@RequestBody Integer Id)
	{
		return ResponseEntity.ok(disSrv.deleteDistributor(Id));
	}
	
	@PutMapping
	public ResponseEntity<?> updateDistributor(@RequestBody DistributorDto disDto)
	{
		return ResponseEntity.ok(disSrv.updateDistributor(disDto));
		
	}
	
	
	
	
	
	
	
}
