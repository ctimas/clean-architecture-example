package ru.ctimas.clean.architecture.adapter.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.ctimas.clean.architecture.adapter.repository.entities.AccountEntity;

import java.util.List;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

    @Query("select acc from account acc")
    List<AccountEntity> findAllAccounts();
}
