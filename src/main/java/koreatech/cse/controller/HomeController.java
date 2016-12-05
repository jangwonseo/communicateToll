package koreatech.cse.controller;

import koreatech.cse.domain.Notice;
import koreatech.cse.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

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
        return "home";
    }

    @RequestMapping(value = "/noticeList")
    public String noticeList(Model model){
        List<Notice> noticeList = noticeService.getNoticeList();
        model.addAttribute("noticeList",noticeList);

        return "/notice/noticelist";
    }

}
