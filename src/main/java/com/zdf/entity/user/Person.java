package com.zdf.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person",catalog="test")
public class Person {
	
	private String personId;
	
	/**姓氏**/
	private String surname;
	/**名字**/
	private String name;
	
	/**昵称**/
	private String nickname;
	/**性别**/
	private String gender;


	@Id
	@Column(name="person_id")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	@Column(name="sur_name")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="nick_name")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name="gender",length=2)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
