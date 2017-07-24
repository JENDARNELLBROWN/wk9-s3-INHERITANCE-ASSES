package TIY.company;

/**
 * Created by jenniferbrown on 7/23/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("recipient " + recipient);
        System.out.println("smtpProvider " + smtpProvider);
        System.out.println("subject "+ super.getSubject());
        System.out.println("body " + super.getBody());
        System.out.println("createdAt " + super.getCreatedAt());
    }

    @Override
    public void printSomeText() {
        super.printSomeText();
        System.out.println("some other text");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone()  {
       Object cloneObject = new EmailNotification(this.getSubject(), this.getBody(), recipient, smtpProvider);

       return cloneObject;
    }
}
