package ru.ctimas.clean.architecture.adapter.converter;

import ru.ctimas.clean.architecture.adapter.repository.entities.AccountEntity;
import ru.ctimas.clean.architecture.domain.Account;

public class AccountConverter {

    public static Account convert(AccountEntity source) {
        Account result = new Account();
        result.setId(source.getId());
        result.setLabel(source.getLabel());
        result.setAccountNumber(source.getAccountNumber());
        return result;
    }
}
