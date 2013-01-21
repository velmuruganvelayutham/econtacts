package org.thymeleaf.econtacts.web.service;

import org.thymeleaf.econtacts.web.domain.User;

public interface UserService {

	public void save(User user);

	public void update(User user);

}