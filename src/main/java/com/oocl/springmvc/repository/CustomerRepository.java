package com.oocl.springmvc.repository;


import com.oocl.springmvc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}