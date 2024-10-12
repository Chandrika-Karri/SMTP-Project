package se.chandrika.GUImailtransfer;

import se.chandrika.mailtransfer.Email;

public class GUIMain {


    public static void main(String[] args) {

        Email email = new Email("chandrika.kovvuri@gmail.com","enaw encs tdmb pddv");
        SendMail sendmail = new SendMail(email);

        Mail mail = new Mail("chandrika.kovvuri@gmail.com", "hello", "GUI mail", null);
        GUI gui = new GUI();
        mail = gui.showEmailPanel();

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

