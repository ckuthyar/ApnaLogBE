package pkg1.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.ContactEntity;
import pkg1.entity.CustomerEntity;
import pkg1.repository.ContactRepo;
import pkg1.repository.CustomerRepo;

@RestController
@RequestMapping("/apnalog")
public class Controller {
	@Autowired
	CustomerRepo customer_repo;
	@Autowired
	ContactRepo contact_repo;
	@PostMapping("/customer/add")
	public String addCustomer(@RequestBody CustomerEntity cue) {
		customer_repo.save(cue);
		return "Success";
	}
	@PutMapping("/generateOTP")
	public int generateOTP(@RequestParam long cust_id) {
		Random rand1=new Random();
		int num1=rand1.nextInt(100000,1000000);
		return num1;
	}
	@GetMapping("/verifyOTP")
	public String verifyOTP(@RequestParam long cust_id, @RequestParam int otp ) {
		return "OTP verified";
	}
	@GetMapping("/fetchMyContacts")
	public List<ContactEntity> fetchMyContacts(@RequestParam long cust_id) {
		return contact_repo.fetchMyContactsByCustomerId(cust_id);
	}
	@GetMapping("/fetchMyContactsByName")
	public List<ContactEntity> fetchMyContactsByName(@RequestParam long cust_id, String name) {
		return contact_repo.fetchMyContactsByName(cust_id, name);
	}
	@GetMapping("/fetchMyContactsByCompany")
	public List<ContactEntity> fetchMyContactsByCompany(@RequestParam long cust_id, String company) {
		return contact_repo.fetchMyContactsByCompany(cust_id, company);
	}
		
}