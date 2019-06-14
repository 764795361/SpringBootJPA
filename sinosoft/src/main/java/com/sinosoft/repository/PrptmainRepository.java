package com.sinosoft.repository;

import com.sinosoft.entity.PrptmainEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  PrptmainRepository extends JpaRepository<PrptmainEntity,String> {

    PrptmainEntity findByproposalno(String policyNo);
}
