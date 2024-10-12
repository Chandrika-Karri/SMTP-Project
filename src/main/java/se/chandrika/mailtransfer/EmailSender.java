package se.chandrika.mailtransfer;


public interface EmailSender {

    public void sendEmail(String to, String subject, String text);

    public void sendEmail(String to, String subject, String text, String cc);
}
