package com.sinosoft;

import com.sinosoft.entity.PrptmainEntity;
import com.sinosoft.repository.PrptmainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SinosoftApplication {


    public static void main(String[] args) {
        SpringApplication.run(SinosoftApplication.class, args);
    }


}
