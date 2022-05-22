package simple.bank.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="tbl_transactions")
@EqualsAndHashCode(of="tid")
@ToString
public class AcctTransaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long   tid;
	
	private double amount;
	
	private String info;
	
	private String type;
	
	@CreationTimestamp
	private LocalDateTime regdate;
	
}
