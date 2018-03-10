package service.impl;

import domain.Log;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import repository.LogRepository;
import repository.UserRepository;
import service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LogRepository logRepository;
	
	@Override
	@Transactional
	public User login(User user) {
		User temp = userRepository.get(user);
		if(temp != null) {
			
			Log log = new Log();
			log.setUser(temp);
			logRepository.save(log);

			userRepository.update(temp);
			
			return temp;
		} else {
			return null;
		}
	}
}
