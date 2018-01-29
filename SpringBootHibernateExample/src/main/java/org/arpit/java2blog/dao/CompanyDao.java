package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Company;
import org.arpit.java2blog.model.Customer;

public interface CompanyDao {
	public List<Company> getAllCompany() ;

	public Company getCompany(int id) ;

	public Company addCompany(Company company);

	public void updateCompany(Company company) ;

	public void deleteCompany(int id) ;
}
