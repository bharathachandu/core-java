package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {
    public static void main(String[] args) {


        AccountDetailsDto dto = new AccountDetailsDto();
        dto.customerId=123;
        dto.name="bharath a";
        dto.bankName="kotak";
        dto.branchName="blg";
        dto.ifscCode="asd211";
        dto.accountNo=123455;
        dto.address="blg";
        dto.accountType="savings";

        AccountDetailsDao dao =new AccountDetailsDao();
        dao.createAccount(dto);
        dao.getDetails();

    }
}
