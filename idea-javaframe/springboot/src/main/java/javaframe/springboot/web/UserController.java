package javaframe.springboot.web;

import javaframe.springboot.dao.UserDAO;
import javaframe.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping("/user/list")
    public String list(Model m) throws Exception {
        List<User> users = userDAO.findAll();
        m.addAttribute("users", users);
        return "user/list";
    }

}
