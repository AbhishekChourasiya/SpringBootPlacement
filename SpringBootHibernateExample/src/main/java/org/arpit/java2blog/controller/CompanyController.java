package org.arpit.java2blog.controller;


import java.util.List;

import org.arpit.java2blog.model.Company;
import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.service.CompanyService;
import org.arpit.java2blog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyController {

	

		@Autowired
		CompanyService companyService;

		@RequestMapping(value = "/getAllCompanyAdmin", method = RequestMethod.GET, headers = "Accept=application/json")
		public String getAllCompanyAdmin(Model model) {

			List<Company> listOfCompany = companyService.getAllCompany();
			model.addAttribute("company", new Company());
			model.addAttribute("listOfCompany", listOfCompany);
			return "companyDetails";
		}

		@RequestMapping(value = "/getAllCompany", method = RequestMethod.GET, headers = "Accept=application/json")
		public String getAllCompany(Model model) {

			List<Company> listOfCompany = companyService.getAllCompany();
			model.addAttribute("company", new Company());
			model.addAttribute("listOfCompany", listOfCompany);
			return "index";
		}

		@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
		public String goToHomePage() {
			return "redirect:/getAllCompany";
		}
		
		@RequestMapping(value = "/getCompany/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
		public Company getCompanyById(@PathVariable int id) {
			return companyService.getCompany(id);
		}

		@RequestMapping(value = "/addCompany", method = RequestMethod.POST, headers = "Accept=application/json")
		public String addCompany(@ModelAttribute("company") Company company) {	
			if(company.getId()==0)
			{
				companyService.addCompany(company);
			}
			else
			{	
				companyService.updateCompany(company);
			}

			return "redirect:/getAllCompanyAdmin";
		}

		@RequestMapping(value = "/updateCompany/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
		public String updateCompany(@PathVariable("id") int id,Model model) {
			model.addAttribute("company", this.companyService.getCompany(id));
			model.addAttribute("listOfCompany", this.companyService.getAllCompany());
			return "companyDetails";
		}

		@RequestMapping(value = "/deleteCompany/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
		public String deleteCompany(@PathVariable("id") int id) {
			companyService.deleteCompany(id);
			return "redirect:/getAllCompanyAdmin";

		}	
	}
