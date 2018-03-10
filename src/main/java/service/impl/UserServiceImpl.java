package service.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String getEmail(String email) {
		return userRepository.getEmail(email);
	}

	@Override
	public void update(User user) {
		userRepository.update(user);

	}


	

}
