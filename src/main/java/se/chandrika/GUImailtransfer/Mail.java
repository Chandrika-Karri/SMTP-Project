package se.chandrika.GUImailtransfer;

public class Mail {


    String to;
    String subject;
    String text;
    String cc;


    public Mail(String to, String subject, String text, String cc) {
        this.to = to;
        this.subject = subject;
        this.text = text;
        this.cc = cc;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getCc() {
        return cc;
    }
}

