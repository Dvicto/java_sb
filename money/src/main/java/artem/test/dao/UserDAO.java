package artem.test.dao;

import java.util.List;
import artem.test.model.User;

public interface UserDAO {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void transfer(String from, String to, int value);
    User getById(int id);
    User getByName(String name);
}
