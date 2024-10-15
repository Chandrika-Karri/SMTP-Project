package se.chandrika.GUImailtransfer;

import se.chandrika.mailtransfer.Email;

public class GUIMain {


    public static void main(String[] args) {

        Email email = new Email("********@gmail.com","**********");
        SendMail sendmail = new SendMail(email);

        GUI gui = new GUI();
        Mail mail = gui.showEmailPanel();

        if (mail != null) {
            sendmail.sendEmail(mail.getTo(), mail.getSubject(), mail.getText());

            System.out.println(mail.getTo() + ", " + mail.getSubject() + ", " + mail.getText());
        }

        while (true) {
            mail = gui.showEmailPanel();
            if (mail != null) {
                sendmail.sendEmail(mail.getTo(), mail.getSubject(), mail.getText());
            } else {

                break;
            }
        }
    }
}

