package ru.ctimas.clean.architecture.adapter;

import ru.ctimas.clean.architecture.adapter.converter.AccountConverter;
import ru.ctimas.clean.architecture.adapter.repository.AccountRepository;
import ru.ctimas.clean.architecture.domain.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountAdapterImpl implements ru.ctimas.clean.architecture.domain.adapter.AccountAdapter {

    private final AccountRepository accountRepository;

    public AccountAdapterImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAllAccounts().stream()
                .map(AccountConverter::convert)
                .collect(Collectors.toList());
    }
}
