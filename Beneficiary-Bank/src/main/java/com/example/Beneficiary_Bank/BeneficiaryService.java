package com.example.Beneficiary_Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryService {
    @Autowired
    BeneficiaryRemote remote;

    public List<Beneficiary> implementFindAcc(int accId) {
        return remote.findAllByAccountId (accId);

    }
    public Beneficiary implementFindById(int beneficiaryId){
        return remote.findById(beneficiaryId).orElse(new Beneficiary());
    }

    public void implementDelete(int id) {

        remote.deleteById(id);
    }

    public List<Beneficiary> implementFindall() {
        return remote.findAll();
    }

    public Beneficiary implementsave(Beneficiary beneficiary) {

        return remote.save(beneficiary);
    }

}
