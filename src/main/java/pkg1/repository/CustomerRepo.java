package pkg1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long>{

}
