package com.empresa.empleados.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.empleados.model.Company;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/rest-servlet.xml" })
public class CompanyDaoTest {

	@Autowired
	private CompanyDao dao;

	@Test
	@Rollback(false)
	@Transactional
	public void testCreateCompany() {
		Company company = new Company();
		company.setName("lala");
		System.out.println(dao.saveAndFlush(company));
	}

}
