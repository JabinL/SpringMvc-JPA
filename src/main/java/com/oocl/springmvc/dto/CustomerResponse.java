package com.oocl.springmvc.dto;

import com.oocl.springmvc.entity.Customer;
import org.springframework.beans.BeanUtils;

public class CustomerResponse {

  private String name;

  public static CustomerResponse to(Customer customer) {
    CustomerResponse customerResponse = new CustomerResponse();
    BeanUtils.copyProperties(customer, customerResponse);
    return customerResponse;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
