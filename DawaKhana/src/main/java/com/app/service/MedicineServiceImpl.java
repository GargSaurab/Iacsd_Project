package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_Exception.ResourceNotFoundException;
import com.app.dao.MedicineDao;
import com.app.dto.ApiResponse;
import com.app.dto.MedicineDTO;
import com.app.entities.Medicine;
import com.app.entities.TypeEnum;

@Service
@Transactional
public class MedicineServiceImpl implements MedicineService {
	
@Autowired	
private MedicineDao medicineDao;

@Autowired
 private SearchService searchSrc;

@Autowired
private ModelMapper mapper;
	@Override
	public List<MedicineDTO> listAllMedicine() {
		System.out.println("In Medicine Service getAll method");
		return medicineDao.findAll()
				.stream()
				.map(medicine -> mapper.map(medicine,MedicineDTO.class))
				.collect(Collectors.toList());
	}
	@Override
	public ApiResponse addMedicine(MedicineDTO medicine) {
	
		Medicine medicineEntity=mapper.map(medicine,Medicine.class);
		Medicine persistantMedi=medicineDao.save(medicineEntity);

        searchSrc.addSearchEntry(medicine.getCompany(), TypeEnum.COMPANY);
		searchSrc.addSearchEntry(medicine.getOriginalName() + medicine.getPower(), TypeEnum.NAME);

		return new ApiResponse("Medicine added to list");
	}
	
	@Override
	public ApiResponse deleteMedicine(Integer medicineId) {
		Medicine Medi=medicineDao.findById(medicineId).orElseThrow(()->new ResourceNotFoundException("MedicineId Not Found"));
		return new ApiResponse("Medicine "+medicineId+" Deleted");
	}
	
	@Override
	public ApiResponse updateMedicine(Integer id, MedicineDTO medicineDTO) {
		Medicine medi=medicineDao.findById(id).orElseThrow(()->new ResourceNotFoundException("Medicine Id Not Found"));
		mapper.map(medicineDTO,medi);
		System.out.println("After Mapping");
		return new ApiResponse("Medicine "+medicineDTO.originalName+" Updated");
	}
	@Override
	public MedicineDTO GetByMedicineId(Integer medId) {
		Medicine mediId=medicineDao.findById(medId).orElseThrow(()-> new ResourceNotFoundException("MedicineId not Found"));
		System.out.println("After getting Data");
		return mapper.map(mediId, MedicineDTO.class);
	}
	@Override
	public List<MedicineDTO> searchMedicine(String query) {
		System.out.println("In Medicine Service search method");

		List<MedicineDTO> medicines= medicineDao.search(query)
		        .stream()
				.map(medicine -> mapper.map(medicine,MedicineDTO.class))
				.collect(Collectors.toList());

               System.out.println("after fetching the data from databasde");

             for(MedicineDTO medicine: medicines)
			 {System.out.println(medicine);}

				return medicines;

	}
	

}
