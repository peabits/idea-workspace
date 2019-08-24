package javaframe.springboot.web;

import javaframe.springboot.mapper.ArticleMapper;
import javaframe.springboot.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping("/user/article/list")
    public String list(Model m) {
        List<Article> articles = articleMapper.findAll();
        m.addAttribute("articles", articles);
        return "user/article/list";
    }

}
