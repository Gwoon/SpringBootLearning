package lhz.lx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = {"/","/index"})
    public String Login(){
        return "index";
    }
}
