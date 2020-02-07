package artem.test.controller;

import artem.test.service.UserService;
import artem.test.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.orm.hibernate5.HibernateJdbcException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import artem.test.model.User;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allUsers(){
        List<User> users = userService.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/users");
        modelAndView.addObject("usersList" ,users);
        return modelAndView;
    }

    @GetMapping(value = "/transfer")
    public ModelAndView transferPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/transferPage");
        return modelAndView;
    }

    @RequestMapping(value = "/transfer", method = RequestMethod.POST)
    public ModelAndView transfer(
            @RequestParam(name = "from", required = false) Integer from,
            @RequestParam(name = "to", required = false) Integer to,
            @RequestParam(name = "value", required = false) Integer value)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        try {
            userService.transfer(from, to, value);
        } catch (Exception e) {
            System.out.println(e);
            modelAndView.setViewName("/transferPage");
        }
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        try {
        userService.add(user);
        } catch (NullPointerException | HibernateJdbcException | NumberFormatException e) {
            System.out.println(e);
            modelAndView.setViewName("/editPage");
        }
        return modelAndView;
    }

    @RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        User user = userService.getById(id);
        userService.delete(user);
        return modelAndView;
    }
}
