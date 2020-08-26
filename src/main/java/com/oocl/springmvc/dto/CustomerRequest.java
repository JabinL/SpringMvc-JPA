package com.oocl.springmvc.dto;

import com.oocl.springmvc.entity.Customer;
import org.springframework.beans.BeanUtils;

public class CustomerRequest {
    private String name;
    private String address;
    private String email;

    public static Customer to(CustomerRequest customerRequest){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerRequest,customer);
        return customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
