package org.thymeleaf.econtacts.web.dao;

import org.thymeleaf.econtacts.web.domain.User;

public interface UserDao {

	public void save(User user);

	public void update(User user);

}
