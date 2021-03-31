package com.jy.test;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

@Controller
@RequestMapping("/board")
public class TestController {

    @RequestMapping(value="/iist", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("name", "abc");
        return "list";
    }

}