package repository;

import domain.User;

public interface UserRepository {
    void save(User user);
    String getEmail(String email);
    void update(User user);
    User get(User user);
}
