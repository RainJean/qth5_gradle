package service.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import repository.UserRepository;
import service.SignInService;

@Service
public class SignInServiceImpl implements SignInService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void signIn(User user) {
		userRepository.save(user);
	}
}
