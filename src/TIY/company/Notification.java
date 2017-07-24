package TIY.company;

import java.time.LocalDateTime;

/**
 * Created by jenniferbrown on 7/23/17.
 */
public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "new";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
    public void transport() {
        throw new NoTransportException();
    }
    public void showStatus () {
        System.out.println(status);
    }
    protected void printSomeText () {
        System.out.println("some text");
    }
}
