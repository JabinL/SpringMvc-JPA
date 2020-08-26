package com.oocl.springmvc.controller;

import com.oocl.springmvc.dto.CustomerRequest;
import com.oocl.springmvc.dto.CustomerResponse;
import com.oocl.springmvc.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    @ResponseBody
    public CustomerResponse addCustomer(CustomerRequest customerRequest){

        System.out.println(customerRequest);
        customerRequest.setAddress("9999");
        customerRequest.setName("Jabin");
        customerRequest.setEmail("2099008974@qq.com");
        customerService.save(customerRequest);
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName("jabin");
        return customerResponse;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomerById(id);
    }

    @GetMapping("/{id}")
    public void getCustomer(@PathVariable Integer id, HttpServletResponse response) throws Exception {
        PrintWriter out = null;
        JSONObject json = new JSONObject();
        response.setContentType("application/json");
        System.out.println(customerService.getCustomerById(id).getName());
        CustomerResponse customerResponse = customerService.getCustomerById(id);
        try{
            out = response.getWriter();
            if(customerResponse != null){
                json.put("customerResponse", customerResponse);
                out.write(json.toString());
            }else{
                json.put("result", "customer not found");
                out.write(json.toString());
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            out.flush();
            out.close();
        }
    }
    @PutMapping("/{id}")
    public CustomerResponse updateCustomer(@PathVariable Integer id, CustomerRequest customerRequest) throws Exception {
        return customerService.updateCustomer(id,customerRequest);
    }
}
