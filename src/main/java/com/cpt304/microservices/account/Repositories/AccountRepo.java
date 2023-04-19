package com.cpt304.microservices.account.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpt304.microservices.account.Models.Account;

public interface AccountRepo extends JpaRepository<Account,Integer> {
    
    
}
