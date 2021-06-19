package com.abc.controller;

import com.abc.bean.Company;
import com.abc.bean.Country;
import com.abc.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @Value("${server.port}")
    private int port;

    @Value("${company.name}")
    private String name;

    @Autowired
    private Student student;

    @Autowired
    private Country country;

    @Autowired
    private Company company;

    // --------------------------------
    @GetMapping("/port")
    public String portHandler(){
        return "port = " + port;
    }

    @GetMapping("/name")
    public String nameHandler(){
        return "company.name = " + name;
    }

    @GetMapping("/student")
    public String studentHandler(){
        return "student = " + student;
    }

    @GetMapping("/country")
    public String countryHandler(){
        return "country = " + country.getCities();
    }

    @GetMapping("/company")
    public String companyHandler(){
        return "company = " + company.getDeparts();
    }
}
