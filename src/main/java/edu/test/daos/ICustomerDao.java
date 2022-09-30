package edu.test.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.test.entities.Customer;
//@Transactional
public interface ICustomerDao extends JpaRepository<Customer, Integer>{
	//finder methods
	public List<Customer> findAll();
	public List<Customer> findByCname(String cname);
}
