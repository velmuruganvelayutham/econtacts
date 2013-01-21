package org.thymeleaf.econtacts.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.econtacts.web.dao.ContactDao;
import org.thymeleaf.econtacts.web.domain.Contact;

import java.util.List;

@Service("contactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao contactDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(Contact contact) {
		contactDao.save(contact);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<Contact> findAll() {

		return contactDao.findAll();

	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteAll() {

		contactDao.deleteAll();
	}

}
