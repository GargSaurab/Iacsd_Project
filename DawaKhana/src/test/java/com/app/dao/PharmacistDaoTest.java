package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Customer;
import com.app.entities.Pharmacist;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class PharmacistDaoTest {
  //
	@Autowired
	private PharmacistDao pharDao;
	
	@Test
	void test() {
		List<Pharmacist> list = List.of(
				new Pharmacist("Mohit",LocalDate.parse("1999-05-05"),"Jharkhand","Mohit123@gmail.com",123546890,LocalDate.parse("2021-01-15"),56000.00,"emp001"),
				new Pharmacist("Saurabh",LocalDate.parse("1999-07-05"),"Haryana","Saurabh123@gmail.com",923546890,LocalDate.parse("2021-11-25"),78000.00,"emp011")
		);

		List<Pharmacist>list2=pharDao.saveAll(list);
		assertEquals(2,list2.size());
	}

}
