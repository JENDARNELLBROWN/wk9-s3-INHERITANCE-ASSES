package TIY.company;

public class Main {



    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("error", "email not sent", "john.doe@email.com", "gmail" );
        TextNotification textNotification = new TextNotification("error", "text not sent", "555-555-5555", "verizon" );

        emailNotification.status = "sent";

        emailNotification.showStatus();
        textNotification.showStatus();
        emailNotification.printSomeText();
        System.out.println(emailNotification.equals(emailNotification.clone()));
}}