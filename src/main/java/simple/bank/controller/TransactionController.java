package simple.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.java.Log;
import simple.bank.domain.AcctTransaction;
import simple.bank.persistence.AcctTransactionRepository;

@Log
@Controller
@RequestMapping("/transactions/")
public class TransactionController {

	@Autowired
	AcctTransactionRepository repo;
	
	@GetMapping("")
	public Optional<AcctTransaction> transactions(@RequestParam Long tid, @RequestParam String date, @RequestParam int page, @RequestParam int size, @RequestParam String type) {
		
		if(tid != 0) {
			return repo.findById(tid);
		}
		
		return null;
	}
}
