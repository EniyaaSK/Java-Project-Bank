package com.example.java_bank_project;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name ="Feign-Interceptor" ,url = "http://localhost:1234/beneficiary")

public interface FiegnCommunicator {
    @GetMapping("/byaccount/{accId}")
    public List<Beneficiary> callByacc(@PathVariable("accId") int accId);

}
