package com.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.ApiResponse;
import com.app.dto.MedicineDTO;

public interface MedicineService {
	
	public List<MedicineDTO> listAllMedicine();
	
	public ApiResponse addMedicine(MedicineDTO medicine);
	
	public ApiResponse deleteMedicine(Integer medicineId);

	public ApiResponse updateMedicine(Integer id, MedicineDTO medicineDTO);
	
	public MedicineDTO GetByMedicineId(Integer medId);

	public List<MedicineDTO> searchMedicine(String query);

}
