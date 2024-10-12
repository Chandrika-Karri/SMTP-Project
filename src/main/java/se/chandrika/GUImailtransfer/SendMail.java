package se.chandrika.GUImailtransfer;


import se.chandrika.mailtransfer.EmailSender;
import se.chandrika.mailtransfer.Email;

public class SendMail implements EmailSender {

    Email email;


    public SendMail(Email email) {
        this.email = email; // Initialize the Email object
    }

    @Override
    public void sendEmail(String to, String subject, String text) {
        email.sendEmail(to, subject, text);
    }

    @Override
    public void sendEmail(String to, String subject, String text, String cc) {
        email.sendEmail(to, subject, text, cc);
    }
}

