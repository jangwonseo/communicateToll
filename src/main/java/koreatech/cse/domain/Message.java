package koreatech.cse.domain;

/**
 * Created by seo on 2016-12-05.
 */
public class Message {
    int id;
    int sendId; //보낸사람 아이디
    int receiveId;  //받는 사람 아이디
    String content;  //내용
    String sendTime;  //보낸 시간
    String sendName; //보낸 사람 이름

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public int getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }



}
