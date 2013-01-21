package org.thymeleaf.econtacts.web.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;
	private Set<Contact> contact = new HashSet<Contact>(0);

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Contact> getContact() {
		return contact;
	}

	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}

}
