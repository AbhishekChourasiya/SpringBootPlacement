package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Company;
import org.arpit.java2blog.model.Customer;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDaoImpl implements CompanyDao{


	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Company> getAllCompany() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Company>  companyList = session.createQuery("from Company").list();
		return companyList;
	}

	public Company getCompany(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Company company = (Company) session.get(Company.class, id);
		return company;
	}

	public Company addCompany(Company company) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(company);
		return company;
	}

	public void updateCompany(Company company) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(company);
		session.update(company);
	}

	public void deleteCompany(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Company p = (Company) session.load(Company.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	} 
}
