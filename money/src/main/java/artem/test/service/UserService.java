package artem.test.service;

import artem.test.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void transfer(String from, String to, int value);
    User getById(int id);
    User getByName(String name);
}