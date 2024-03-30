package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MedicineDTO;
import com.app.entities.Medicine;
import com.app.service.MedicineService;

@RestController
@RequestMapping("/medicine")
@CrossOrigin(origins = "http://localhost:3000")
public class MedicineController {

	@Autowired
	private MedicineService mediService;

	@GetMapping("/getAllMedicine")
	private ResponseEntity<?> listAllMedicine() {
		System.out.println("In Medicine Constructor getAll method");
		return ResponseEntity.ok(mediService.listAllMedicine());
	}

	@PostMapping("/addMedicine")
	private ResponseEntity<?> addMedicine(@RequestBody MedicineDTO medicine) {
		System.out.println("In Medicine Constructor addMedicine method");
		return ResponseEntity.ok(mediService.addMedicine(medicine));
	}

	@DeleteMapping("/{medicineId}")
	public ResponseEntity<?> deleteMedicine(@PathVariable Integer medicineId) {
		System.out.println("In Medicine Constructor deleteMedicine Method");
		return ResponseEntity.ok(mediService.deleteMedicine(medicineId));
	}

	@PutMapping("/{Id}")
	public ResponseEntity<?> updateMedicine(@PathVariable Integer Id, @RequestBody MedicineDTO medicineDTO) {
		return ResponseEntity.ok(mediService.updateMedicine(Id, medicineDTO));
	}

	@GetMapping("/{medId}")
	public ResponseEntity<?> getMedicineId(@PathVariable Integer medId) {
		System.out.println("In Medicine Constructor getBy Id method");
		return ResponseEntity.ok(mediService.GetByMedicineId(medId));
	}

	@GetMapping("/search")
	public ResponseEntity<?> search(@RequestParam(name = "query") String query) {
		System.out.println("in the search medicine controller");
		System.out.println(query);
		try {
			// Assuming mediService is an instance of a service class that handles the
			// search logic
			return ResponseEntity.ok(mediService.searchMedicine(query));
		} catch (Exception e) {
			e.printStackTrace();
			String errorMessage = "An error occurred while processing your request: " + e.getMessage();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
		}
	}

}
