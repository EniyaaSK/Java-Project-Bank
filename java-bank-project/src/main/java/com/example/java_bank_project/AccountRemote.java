package com.example.java_bank_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRemote extends JpaRepository<Account,Integer> {
}
