package pkg1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pkg1.entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity, Long>{
	@Query(value="select * from contact where cust_id=:id",nativeQuery=true)
	public List<ContactEntity> fetchMyContactsByCustomerId(@Param(value = "id") long id);
	
	@Query(value="select * from contact where cust_id=:id and name like:name",nativeQuery=true)
	public List<ContactEntity> fetchMyContactsByName(@Param(value = "id") long id, @Param(value = "name") String name);
	
	@Query(value="select * from contact where cust_id=:id and company like:company",nativeQuery=true)
	public List<ContactEntity> fetchMyContactsByCompany(@Param(value = "id") long id, @Param(value = "company") String company);
}
