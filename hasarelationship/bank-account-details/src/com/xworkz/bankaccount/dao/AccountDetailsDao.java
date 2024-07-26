package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {
    AccountDetailsDto dto;

    public boolean createAccount(AccountDetailsDto dto) {
        boolean isCreated = false;
        System.out.println("Account is created");
        if (null != dto) {
            this.dto = dto;
            isCreated = true;

        }
        return isCreated;
    }
        public void getDetails ()
        {
            System.out.println("The Customer Id is " + dto.customerId);
            System.out.println("The Customer Name is " + dto.name);
            System.out.println("The Customer bank Name is " + dto.bankName);
            System.out.println("The Customer bank branch Name is " + dto.branchName);
            System.out.println("The Customer IFSC is " + dto.ifscCode);
            System.out.println("The Customer Account number is " + dto.accountNo);
            System.out.println("The Customer Account Type is " + dto.accountType);
            System.out.println("The Customer Address is " + dto.address);

        }

}
