package ru.ctimas.clean.architecture.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.ctimas.clean.architecture.adapter.AccountAdapterImpl;
import ru.ctimas.clean.architecture.adapter.repository.AccountRepository;
import ru.ctimas.clean.architecture.domain.adapter.AccountAdapter;


@Configuration
@EnableJpaRepositories(basePackages = "ru.ctimas.clean.architecture.adapter.repository")
@EntityScan(basePackages = "ru.ctimas.clean.architecture.adapter.repository.entities")
public class DataRepositoryConfig {

    @Bean
    public AccountAdapter accountAdapter(AccountRepository accountRepository) {
        return new AccountAdapterImpl(accountRepository);
    }
}
