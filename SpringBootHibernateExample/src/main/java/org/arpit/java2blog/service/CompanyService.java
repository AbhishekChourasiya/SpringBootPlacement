package org.arpit.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.arpit.java2blog.dao.CompanyDao;
import org.arpit.java2blog.dao.CustomerDao;
import org.arpit.java2blog.model.Company;
import org.arpit.java2blog.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("companyService")
public class CompanyService {

	@Autowired
	CompanyDao companyDao;

	@Transactional
	public List<Company> getAllCompany() {
		return companyDao.getAllCompany();
	}

	@Transactional
	public Company getCompany(int id) {
		return companyDao.getCompany(id);
	}

	@Transactional
	public void addCompany(Company company) {
		companyDao.addCompany(company);
	}

	@Transactional
	public void updateCompany(Company company) {
		companyDao.updateCompany(company);

	}

	@Transactional
	public void deleteCompany(int id) {
		companyDao.deleteCompany(id);
	}
}


