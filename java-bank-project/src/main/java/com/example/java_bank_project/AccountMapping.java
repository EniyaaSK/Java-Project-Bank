package com.example.java_bank_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountMapping {
    @Autowired
    AccountService service;

    @PostMapping("/add")
    public Account callSave(@RequestBody Account account) {
        return service.implementSave(account);
    }

    @GetMapping("/{id}")
    public Account callOne(@PathVariable("id") int id){
        return service.implementFindByID(id) ;
    }

    @GetMapping("/")
    public List<Account> callFetch(){
        return service.implementFindAll();
    }
    @PutMapping("/update")
    public Account update(@RequestBody Account account){
        return service.implementSave (account) ;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" AccountId has been deleted";
    }
}
