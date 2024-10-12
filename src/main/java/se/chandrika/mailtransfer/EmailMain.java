package se.chandrika.mailtransfer;


public class EmailMain {
    public static void main(String[] args) {
        Email email = new Email("chandrika.kovvuri@gmail.com", "enaw encs tdmb pddv");
        email.sendEmail("chandrika.kovvuri@gmail.com", "Hello", "Test mail", null);
        email.sendEmail("chandrika.kovvuri@gmail.com", "Hello", "Test mail", "ratnareddy99@gmail.com");
    }
}