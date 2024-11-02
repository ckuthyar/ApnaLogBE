package pkg1.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cust_id")
	private CustomerEntity cust_id;
	private String company;
	private LocalDate updated_on;
	public ContactEntity(long id, String name, CustomerEntity cust_id, String company, LocalDate updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.cust_id = cust_id;
		this.company = company;
		this.updated_on = updated_on;
	}
	public ContactEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustomerEntity getCust_id() {
		return cust_id;
	}
	public void setCust_id(CustomerEntity cust_id) {
		this.cust_id = cust_id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public LocalDate getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(LocalDate updated_on) {
		this.updated_on = updated_on;
	}
	

}
