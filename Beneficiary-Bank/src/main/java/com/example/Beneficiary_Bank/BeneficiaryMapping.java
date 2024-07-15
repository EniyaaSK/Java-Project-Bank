package com.example.Beneficiary_Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryMapping {
    @Autowired
    public BeneficiaryService service;

    @PostMapping("/add")
    public Beneficiary order (@RequestBody Beneficiary beneficiary) {
        return service.implementsave(beneficiary);
    }
    @GetMapping("/byaccount/{accId}")
    public List<Beneficiary> callByacc(@PathVariable("accId") int accId){
        return service.implementFindAcc(accId);
    }

    @GetMapping("/beneficiry/{id}")
    public Beneficiary fetchOne(@PathVariable("id") int id){
        return service.implementFindById(id);
    }
    @GetMapping("/get")
    public List<Beneficiary> viewAll() {
        return service.implementFindall();
    }
    @PutMapping("/update")
    public Beneficiary update(@RequestBody Beneficiary beneficiary){
        return service.implementsave(beneficiary) ;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" Beneficiary has been deleted";
    }
}
