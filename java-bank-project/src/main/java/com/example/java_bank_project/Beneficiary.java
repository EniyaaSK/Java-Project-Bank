package com.example.java_bank_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiary {
    private int beneficiaryId;
    private int accountId;
    private Long accountNumber;
    private String beneficiaryName;
    private String ifscCode;
}
