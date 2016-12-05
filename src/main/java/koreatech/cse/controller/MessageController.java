package koreatech.cse.controller;

import koreatech.cse.domain.Message;
import koreatech.cse.service.MessageService;
import koreatech.cse.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
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


//    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
//    public


}
