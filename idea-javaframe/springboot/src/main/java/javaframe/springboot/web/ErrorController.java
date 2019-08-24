package javaframe.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("/err")
    public void error() throws Exception {
        throw new Exception("this is a error");
    }

}
