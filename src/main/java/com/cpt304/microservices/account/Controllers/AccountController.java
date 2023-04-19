package com.cpt304.microservices.account.Repositories;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @GetMapping("/balance") //http://localhost:8081/api/account/balance?accountId=123
    public double getBalance(@RequestParam int accountId) {
        return accountId;
    }
}
