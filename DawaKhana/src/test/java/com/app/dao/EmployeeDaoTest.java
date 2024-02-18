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

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class EmployeeDaoTest {
  //
	@Autowired
	private CustomerDao custDao;
	
	@Test
	void test() {

		List<Customer> list = List.of(
				new Customer("Mohit",LocalDate.parse("1999-05-05"),"Jharkhand","Mohit123@gmail.com",123546890),
				new Customer("Saurabh",LocalDate.parse("1999-07-05"),"Haryana","Saurabh123@gmail.com",923546890)
		);

		List<Customer>list2=custDao.saveAll(list);
		assertEquals(4,list2.size());
	
	}

}
