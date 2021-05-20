package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table(name="users")
@AllArgsConstructor
public class User {

	public User() {}
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="email")
	private String eMail;
	
	@Column(name="password")
	private String password;
	
}
