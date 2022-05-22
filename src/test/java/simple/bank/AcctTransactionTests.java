package simple.bank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.java.Log;
import simple.bank.domain.AcctTransaction;
import simple.bank.persistence.AcctTransactionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class AcctTransactionTests {

	@Autowired
	private AcctTransactionRepository repo;
	
	@Test
	public void insertDummy() {
		for(int i = 1; i <= 100; i++ ) {
			AcctTransaction acctTran = new AcctTransaction();
			
			acctTran.setAmount(i * 1000);
			acctTran.setInfo("은행" + i + "호");
			
			if(i % 2 == 1) {
				acctTran.setType("입금");
			} else {
				acctTran.setType("출금");
			}
			
			repo.save(acctTran);
		}
	}
	
	@Test
	public void getSingleTransaction() {
		
	}
}
