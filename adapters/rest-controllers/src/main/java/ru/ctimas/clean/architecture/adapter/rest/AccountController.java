package ru.ctimas.clean.architecture.adapter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ctimas.clean.architecture.GetAccountUseCase;
import ru.ctimas.clean.architecture.adapter.rest.converter.AccountConverter;
import ru.ctimas.clean.architecture.adapter.rest.model.AccountRestModel;
import ru.ctimas.clean.architecture.domain.Account;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final GetAccountUseCase useCase;

    public AccountController(GetAccountUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<AccountRestModel> getAccounts() {
        List<Account> allAccounts = useCase.getAllAccounts();
        return allAccounts.stream().map(AccountConverter::convert).collect(Collectors.toUnmodifiableList());
    }
}
