package com.example.AccomadationForStudent.Controllers;

import com.example.AccomadationForStudent.Models.Account;
import com.example.AccomadationForStudent.Models.ResponseObject;
import com.example.AccomadationForStudent.Repositories.AccountRepository;
import com.example.AccomadationForStudent.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/login")
    ResponseEntity<ResponseObject> Validate(@RequestBody Account account) {
        return accountService.Validate(account.getUsername(), account.getPassword());
    }


}