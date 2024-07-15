package com.example.java_bank_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

    public Account implementFindByID(int id){
        Account obj = remote.findById(id).orElse(new Account());
        if(obj!=null){
            obj.setMyBeneficiary (fiegnCommunicator.callByacc (obj.getAccountId()));
        }
        return obj;
    }

    public List<Account> implementFindAll (){
        return remote.findAll();
    }

    public Account implementSave(Account account){
        return remote.save(account);
    }
    public void implementDelete(int id) {

        remote.deleteById(id);
    }

}
