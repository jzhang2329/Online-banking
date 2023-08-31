package com.jz.finance.model.repository;

import com.jz.finance.model.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}