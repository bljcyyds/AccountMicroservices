package com.cpt304.microservices.account.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpt304.microservices.account.Models.Account;
import com.cpt304.microservices.account.Repositories.AccountRepo;


@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

    public double getBalance(int accountId){
        Optional<Account> account = accountRepo.findById(accountId);
        return account.get().getBalance();
    }
}
 