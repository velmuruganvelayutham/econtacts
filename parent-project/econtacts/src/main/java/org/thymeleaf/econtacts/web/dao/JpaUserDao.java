package org.thymeleaf.econtacts.web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thymeleaf.econtacts.web.domain.User;

@Repository
public class JpaUserDao implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

}
