package repository;

import domain.Log;
import domain.User;

import java.util.List;

public interface LogRepository {

    void save(Log log);
    List<Log> select(User user);
}
