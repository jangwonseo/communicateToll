package koreatech.cse.domain;

/**
 * Created by seo on 2016-12-05.
 */
public class Notice {
    int id;
    String title;
    String content;
    String date;
    String writerUserName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWriterUserId() {
        return writerUserName;
    }

    public void setWriterUserId(String writerUserName) {
        this.writerUserName = writerUserName;
    }



}
