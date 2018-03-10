package service;


import domain.User;

public interface UserService {
	public String getEmail(String email);
	public void update(User user);
}
