package ru.ctimas.clean.architecture.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ctimas.clean.architecture.GetAccountUseCase;
import ru.ctimas.clean.architecture.domain.adapter.AccountAdapter;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetAccountUseCase getAccountUseCase(AccountAdapter accountAdapter){
        return new GetAccountUseCase(accountAdapter);
    }
}
