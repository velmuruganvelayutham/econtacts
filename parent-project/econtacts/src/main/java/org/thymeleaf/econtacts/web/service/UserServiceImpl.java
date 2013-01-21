package org.thymeleaf.econtacts.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.econtacts.web.dao.UserDao;
import org.thymeleaf.econtacts.web.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(User user) {
		userDao.save(user);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(User user) {
		userDao.update(user);

	}

}
