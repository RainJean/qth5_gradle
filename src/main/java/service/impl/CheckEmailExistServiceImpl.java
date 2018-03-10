package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.UserRepository;
import service.CheckEmailExistService;

@Service
public class CheckEmailExistServiceImpl implements CheckEmailExistService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean checkEmailExist(String uEmail) {
		if(userRepository.getEmail(uEmail) == null || "".equals(userRepository.getEmail(uEmail))) {
			return false;
		}
		return true; //返回真則郵箱存在
	}


	
}
