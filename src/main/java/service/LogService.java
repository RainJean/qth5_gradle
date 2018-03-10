package service;

import domain.Log;
import domain.User;

import java.util.List;



public interface LogService {
	public void save(Log log);
	public List<Log> select(User user);
}
