package com.cpt304.microservices.account.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpt304.microservices.account.Services.AccountService;


@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/balance") //http://localhost:8081/api/account/balance?accountId=123
    public double getBalance(@RequestParam int accountId) {
        return accountService.getBalance(accountId);
    }
}
