package koreatech.cse.service;

import koreatech.cse.domain.Message;
import koreatech.cse.domain.Notice;
import koreatech.cse.repository.MessageMapper;
import koreatech.cse.repository.NoticeMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MessageService {
   @Inject
   MessageMapper messageMapper;

   public List<Message> getAllMessageList(){
       List<Message> list = messageMapper.findAll();
       return list;
   }

   public void sendMessage(Message message){
       messageMapper.insert(message);
   }

   public List<Message> getReceivedAllMessage(int myId ){
       List<Message> myMessageList = messageMapper.findMessageByReceivedId(myId);
       return myMessageList;
    }

}
