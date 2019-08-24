package javaframe.springboot.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javaframe.springboot.mapper.ComputerMapper;
import javaframe.springboot.pojo.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ComputerController {

    @Autowired
    ComputerMapper computerMapper;

    @RequestMapping("/goods/computer/list")
    public String list(Model model,
                       @RequestParam(value = "start", defaultValue = "0") int start,
                       @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start, size, "id desc");
        List<Computer> computers = computerMapper.findAll();
        PageInfo<Computer> pageInfo = new PageInfo<>(computers);
        model.addAttribute("pageInfo", pageInfo);
        return "goods/computer/list";
    }

    @RequestMapping("/goods/computer/add")
    public String add() throws Exception {
        return "goods/computer/add";
    }

    @RequestMapping("/goods/computer/addCommit")
    public String addCommit(Computer computer) throws Exception {
        computerMapper.save(computer);
        return "redirect:list";
    }

    @RequestMapping("/goods/computer/delete")
    public String delete(int id) throws Exception  {
//    public String delete(Computer computer) throws Exception {
        computerMapper.delete(id);
        return "redirect:list";
    }

    @RequestMapping("/goods/computer/edit")
    public String edit(int id, Model model) throws Exception {
        Computer computer = computerMapper.get(id);
        model.addAttribute("computer", computer);
        return "goods/computer/edit";
    }

    @RequestMapping("/goods/computer/update")
    public String update(Computer computer) throws Exception {
        computerMapper.update(computer);
        return "redirect:list";
    }

}
