package koreatech.cse.controller;

import koreatech.cse.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/")
public class HomeController {
    @Inject
    NoticeService noticeService;

    @ModelAttribute("name")
    private String getName() {
        return "IamHomeControllerModelAttribute";
    }

    @RequestMapping(value = "/")
    public String index() {
        return "hello";
    }

    @RequestMapping(value = "/home")
    public String mainHome(){
        return "/home";
    }



}
