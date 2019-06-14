package com.sinosoft.controller;

import com.sinosoft.entity.PrptmainEntity;
import com.sinosoft.repository.PrptmainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/spring")
public class PrptmainController {

    @Autowired
    private PrptmainRepository prptmainRepository;

    @RequestMapping("/prptmain")
    public PrptmainEntity getPrptmainEntity(@RequestParam String policyno){
        PrptmainEntity prptmainEntity = prptmainRepository.findByproposalno(policyno);
//        prptmainRepositor
        return  prptmainEntity;
    }
}
