package org.thymeleaf.econtacts.web.dao;

import org.thymeleaf.econtacts.web.domain.Contact;

import java.util.List;

public interface ContactDao {

	public void save(Contact contact);

	public List<Contact> findAll();

	public void deleteAll();
}
