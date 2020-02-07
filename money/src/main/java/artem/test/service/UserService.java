package artem.test.service;

import artem.test.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void transfer(int from, int to, int value);
    User getById(int id);
}