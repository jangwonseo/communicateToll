package koreatech.cse.service;

import koreatech.cse.domain.Notice;
import koreatech.cse.repository.NoticeMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class NoticeService {
   @Inject
   NoticeMapper noticeMapper;

   public List<Notice> getNoticeList(){
       List<Notice> list = noticeMapper.findAll();

       return list;
   }


}
