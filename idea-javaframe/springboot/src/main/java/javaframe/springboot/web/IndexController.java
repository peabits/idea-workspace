package javaframe.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public void index(Model m) {
        m.addAttribute("now", new Date());
    }

}
