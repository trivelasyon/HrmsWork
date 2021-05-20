package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="system_users")
@AllArgsConstructor
public class SystemUser {
	
	public SystemUser() {}
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surName;

}
