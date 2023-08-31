package com.jz.finance.service;

import com.jz.finance.model.dto.BankAccount;
import com.jz.finance.model.dto.UtilityAccount;
import com.jz.finance.model.entity.BankAccountEntity;
import com.jz.finance.model.entity.UtilityAccountEntity;
import com.jz.finance.model.mapper.BankAccountMapper;
import com.jz.finance.model.mapper.UtilityAccountMapper;
import com.jz.finance.repository.BankAccountRepository;
import com.jz.finance.repository.UtilityAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}
