package ru.ctimas.clean.architecture;

import ru.ctimas.clean.architecture.domain.Account;
import ru.ctimas.clean.architecture.domain.adapter.AccountAdapter;

import java.util.List;

/**
 * Сценарий получения списка счетов
 */
public class GetAccountUseCase {

    private final AccountAdapter accountAdapter;

    public GetAccountUseCase(AccountAdapter accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    /**
     * сценарий получения списка счетов из БД
     * @return списко счетов
     */
    public List<Account> getAllAccounts() {
        List<Account> allAccount = accountAdapter.getAllAccount();
        return allAccount;
    }
}
