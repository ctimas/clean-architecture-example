package ru.ctimas.clean.architecture.adapter.rest.converter;

import ru.ctimas.clean.architecture.adapter.rest.model.AccountRestModel;
import ru.ctimas.clean.architecture.domain.Account;

public class AccountConverter {

    public static AccountRestModel convert(Account source) {
        AccountRestModel result = new AccountRestModel();

        result.setId(source.getId());
        result.setLabel(source.getLabel());
        result.setAccountNumber(source.getAccountNumber());

        return result;
    }
}
