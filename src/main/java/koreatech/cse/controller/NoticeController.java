package koreatech.cse.controller;

import koreatech.cse.domain.Notice;
import koreatech.cse.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {
    @Inject
    NoticeService noticeService;

    @RequestMapping(value = "/noticeList")
    public String noticeList(Model model){
        List<Notice> noticeList = noticeService.getNoticeList();
        model.addAttribute("noticeList",noticeList);

        return "/notice/noticelist";
    }

    @RequestMapping(value = "/uploadNotice")
    public String uploadNotice(){
        return "/notice/uploadNotice";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/uploadNotice")
    public String uploadNoticePost(@RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("user_name") String user_name, Model model){
        Calendar currentDate = Calendar.getInstance();
        String currentYearStr = ""+currentDate.get(Calendar.YEAR);
        String currentMonthStr = ""+currentDate.get(Calendar.MONTH);
        String currentDateStr = ""+currentDate.get(Calendar.DATE);
        String currentHourStr = ""+currentDate.get(Calendar.HOUR);
        String currentMinStr = ""+currentDate.get(Calendar.MINUTE);
        String currentSecStr = ""+currentDate.get(Calendar.SECOND);
        String dateStr = currentYearStr+"년"+currentMonthStr+"월"+currentDateStr+"일 "+currentHourStr+":"+currentMinStr+":"+currentSecStr;

        Notice notice = new Notice();
        notice.setTitle(title);
        notice.setContent(content);
        notice.setDate(dateStr);
        notice.setWriterUserId(user_name);

        noticeService.setNotice(notice);

        return "redirect:/notice/noticeList";

    }

}
