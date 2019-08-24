package javaframe.springboot.web;

import javaframe.springboot.mapper.AdministratorMapper;
import javaframe.springboot.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdministratorController {

    @Autowired
    AdministratorMapper administratorMapper;

    @RequestMapping("/administrator/list")
    public String list(Model m) throws Exception {
        List<Administrator> administrators = administratorMapper.findAll();
        m.addAttribute("administrators", administrators);
        return "administrator/list";
    }

}
