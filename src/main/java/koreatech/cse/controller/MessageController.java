package koreatech.cse.controller;

import koreatech.cse.domain.Message;
import koreatech.cse.service.MessageService;
import koreatech.cse.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {
    @Inject
    MessageService messageService;
    @Inject
    UserService userService;

    @RequestMapping(value = "/{userId}")
    public String messageList(@PathVariable int userId, Model model){
        List<Message> messageList = messageService.getReceivedAllMessage(userId);
        model.addAttribute("messageList",messageList);
        return "message/messageList";
    }
    @RequestMapping(value = "/sendMessage")
    public String sendMessage(){
        return "message/sendMessage";
    }


    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public String sendMessagePost(@RequestParam("send_id") int sendId, @RequestParam("receive_id") int receiveId, @RequestParam("content") String content, Model model){
        System.out.println("hhhfhfhfh : "+sendId+"    "+receiveId+"      "+content+"      ");
        Calendar currentDate = Calendar.getInstance();
        String currentYearStr = ""+currentDate.get(Calendar.YEAR);
        String currentMonthStr = ""+currentDate.get(Calendar.MONTH);
        String currentDateStr = ""+currentDate.get(Calendar.DATE);
        String currentHourStr = ""+currentDate.get(Calendar.HOUR);
        String currentMinStr = ""+currentDate.get(Calendar.MINUTE);
        String currentSecStr = ""+currentDate.get(Calendar.SECOND);
        String dateStr = currentYearStr+"년"+currentMonthStr+"월"+currentDateStr+"일 "+currentHourStr+":"+currentMinStr+":"+currentSecStr;
        String sendName = userService.findUserById(sendId).getName();


        Message message = new Message();
        message.setReceiveId(receiveId);
        message.setSendId(sendId);
        message.setContent(content);
        message.setSendTime(dateStr);
        message.setSendName(sendName);

        messageService.sendMessage(message);

        return "redirect:/message/"+receiveId;
    }


}
