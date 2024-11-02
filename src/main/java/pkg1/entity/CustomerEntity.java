package pkg1.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String mobile;
	private int otp;
	
	private LocalDate updated_on;
	@OneToMany(mappedBy="cust_id")
	private List<ContactEntity> cte;
	
	public CustomerEntity(long id, String name, String email, String mobile, int otp, LocalDate updated_on,
			List<ContactEntity> cte) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.otp = otp;
		this.updated_on = updated_on;
		this.cte = cte;
	}
	public CustomerEntity() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public LocalDate getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(LocalDate updated_on) {
		this.updated_on = updated_on;
	}
	

}
