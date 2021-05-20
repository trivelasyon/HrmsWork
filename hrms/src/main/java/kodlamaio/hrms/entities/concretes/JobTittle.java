package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="job_titles")
@AllArgsConstructor
@Data
public class JobTittle {
	
	public JobTittle() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="tittle")
	private String tittle;

}
