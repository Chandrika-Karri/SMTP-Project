package se.chandrika.mailtransfer;


public class EmailMain {
    public static void main(String[] args) {
        Email email = new Email("********@gmail.com", "********");
        email.sendEmail("**********@gmail.com", "Hello", "Test mail", null);
        email.sendEmail("**********@gmail.com", "Hello", "Test mail", "**************@gmail.com");
    }
}
