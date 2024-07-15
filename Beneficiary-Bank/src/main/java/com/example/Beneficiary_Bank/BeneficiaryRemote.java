package com.example.Beneficiary_Bank;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeneficiaryRemote extends JpaRepository<Beneficiary,Integer> {
    List<Beneficiary> findAllByAccountId (int accountId );
}
