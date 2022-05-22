package simple.bank.persistence;

import org.springframework.data.repository.CrudRepository;

import simple.bank.domain.AcctTransaction;

public interface AcctTransactionRepository extends CrudRepository<AcctTransaction, Long>{

}
