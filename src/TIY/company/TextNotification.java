package TIY.company;

/**
 * Created by jenniferbrown on 7/23/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        super.printSomeText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("recipient " + recipient);
        System.out.println("smsProvider " + smsProvider);
        System.out.println("subject "+ super.getSubject());
        System.out.println("body " + super.getBody());
        System.out.println("createdAt " + super.getCreatedAt());
    }
}
