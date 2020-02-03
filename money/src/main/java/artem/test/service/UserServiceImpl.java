package artem.test.service;

import artem.test.dao.UserDAO;
import artem.test.dao.UserDAOImpl;
import artem.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Transactional
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Transactional
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Transactional
    public void transfer(String from, String to, int value) {
        userDAO.transfer(from, to, value);
    }

    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Transactional
    public  User getByName(String name) {
        return userDAO.getByName(name);
    }
}