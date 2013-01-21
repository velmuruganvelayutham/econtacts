package org.thymeleaf.econtacts.web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thymeleaf.econtacts.web.domain.Contact;

import java.util.List;

@Repository
public class JpaContactDao implements ContactDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);

	}

	@SuppressWarnings("unchecked")
	public List<Contact> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Contact")
				.list();

	}

	@SuppressWarnings("deprecation")
	public void deleteAll() {
		sessionFactory.getCurrentSession().delete("from contact");

	}

}
