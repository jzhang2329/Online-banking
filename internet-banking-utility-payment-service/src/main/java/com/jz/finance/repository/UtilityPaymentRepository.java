package com.jz.finance.repository;

import com.jz.finance.model.dto.UtilityPayment;
import com.jz.finance.model.entity.UtilityPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}