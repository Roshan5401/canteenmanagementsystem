package com.canteen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.canteen.entities.CanteenUsers;
import com.canteen.entities.GlobalEmployees;


public interface CanteenUserRepository extends JpaRepository<CanteenUsers, Integer>{

	public CanteenUsers findByEmail(String email);
	public CanteenUsers findByRole(String r);
	
}
