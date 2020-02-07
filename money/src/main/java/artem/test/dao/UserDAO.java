package artem.test.dao;

import java.util.List;
import artem.test.model.User;

public interface UserDAO {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void transfer(int from, int to, int value);
    User getById(int id);
}
