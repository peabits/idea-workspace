package javaframe.springboot.web;

import javaframe.springboot.dao.PhoneDAO;
import javaframe.springboot.pojo.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhoneController {

    @Autowired
    private PhoneDAO phoneDAO;

    @RequestMapping("/goods/phone/list")
    public String list(Model model,
                       @RequestParam(value = "start", defaultValue = "0") int start,
                       @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start < 0 ? 0 : start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<Phone> page = phoneDAO.findAll(pageable);
//        System.out.println(page.getNumber());
//        System.out.println(page.getNumberOfElements());
//        System.out.println(page.getSize());
//        System.out.println(page.getTotalElements());
//        System.out.println(page.getTotalPages());
        model.addAttribute("page", page);

//        List<Phone> phones = phoneDAO.findAll();
//        model.addAttribute("phones", phones);

        return "goods/phone/list";
    }

    @RequestMapping("/goods/phone/addCommit")
    public String add(Phone phone) throws Exception {
        phoneDAO.save(phone);
        return "redirect:list";
    }

    @RequestMapping("goods/phone/add")
    public String addView() throws Exception {
        return "goods/phone/add";
    }

    @RequestMapping("/goods/phone/delete")
    public String delete(Phone phone) throws Exception {
        phoneDAO.delete(phone);
        return "redirect:list";
    }

    @RequestMapping("/goods/phone/update")
    public String update(Phone phone) throws Exception {
        phoneDAO.save(phone);
        return "redirect:list";
    }

    @RequestMapping("/goods/phone/edit")
    public String edit(int id, Model model) throws Exception {
        Phone phone = phoneDAO.getOne(id);
        model.addAttribute("phone", phone);
        return "goods/phone/edit";
    }

}