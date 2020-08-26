package com.oocl.springmvc.services;

import com.oocl.springmvc.dto.CustomerRequest;
import com.oocl.springmvc.dto.CustomerResponse;
import com.oocl.springmvc.entity.Customer;
import com.oocl.springmvc.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Component
@Service
@Transactional
public class CustomerService {
  @Autowired CustomerRepository customerRepository;


  public CustomerResponse save(CustomerRequest customerRequest) {
    return CustomerResponse.to(customerRepository.save(CustomerRequest.to(customerRequest)));
  }

//  public List<CustomerResponse> listAll() {
//    return customerRepository.findAll().stream().map(CustomerResponse::to)
//        .collect(Collectors.toList());
//  }


  public CustomerResponse getCustomerById(Integer id) throws Exception {

//      return CustomerResponse.to(customerRepository.findById(id));
    return null;

  }

  public void deleteCustomerById(Integer id) {
     customerRepository.deleteById(id);
  }

  public CustomerResponse updateCustomer(Integer id, CustomerRequest customerRequest) throws Exception {
//    Optional<Customer> customer = customerRepository.findById(id);
//    if (customer.isPresent()) {
//      BeanUtils.copyProperties(customerRequest,customer.get());
//      return CustomerResponse.to(customerRepository.save(customer.get()));
//    }
//    throw  new Exception();
    return null;
  }
}
