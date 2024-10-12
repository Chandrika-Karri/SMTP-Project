package se.chandrika.mailtransfer;


import javax.mail.Session;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email implements EmailSender {

    private String username;
    private String password;
    private java.util.Properties properties;

    public Email(String username, String password) {
        this.username = username;
        this.password = password;

        this.properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
    }


    @Override
    public void sendEmail(String to, String subject, String text) {
        executeSendingEmail(to, subject, text, null);
    }

    @Override
    public void sendEmail(String to, String subject, String text, String cc) {
        executeSendingEmail(to, subject, text, cc);
    }

    private void executeSendingEmail(String to, String subject, String messageText, String cc) {
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(this.username));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            if (cc != null) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
            }

            message.setSubject(subject);

            message.setText(messageText);

            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}