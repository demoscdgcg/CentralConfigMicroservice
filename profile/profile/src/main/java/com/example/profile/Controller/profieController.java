package com.example.profile.Controller;

import com.example.profile.Dto.AccountsContectInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/env")
@RestController
public class profieController {
    @Autowired
    private AccountsContectInfoDto accountsContectInfoDto;
    //url->http://localhost:8088/api/env/get
    @GetMapping("/get")
    public ResponseEntity<?> getData(){
        return  new ResponseEntity<>(accountsContectInfoDto, HttpStatus.OK);
    }
}
