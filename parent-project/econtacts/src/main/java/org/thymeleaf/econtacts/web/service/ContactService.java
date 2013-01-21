package org.thymeleaf.econtacts.web.service;

import org.thymeleaf.econtacts.web.domain.Contact;

import java.util.List;

public interface ContactService {

	public void save(Contact contact);

	public List<Contact> findAll();

	public void deleteAll();

}
