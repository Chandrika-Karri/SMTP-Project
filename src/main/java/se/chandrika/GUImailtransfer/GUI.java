package se.chandrika.GUImailtransfer;


import javax.swing.*;

public class GUI {
    JPanel emailPanel;
    JTextField mailAdressField;
    JTextField subjectField;
    JTextField messageTextField;
    JTextField ccField;

    public GUI() {
        emailPanel = new JPanel();
        mailAdressField = new JTextField(20);
        subjectField = new JTextField(20);
        messageTextField = new JTextField(20);
        ccField = new JTextField(20);


        emailPanel.add(new JLabel("Till: "));
        emailPanel.add(mailAdressField);
        emailPanel.add(Box.createHorizontalStrut(15));


        emailPanel.add(new JLabel("Subject: "));
        emailPanel.add(subjectField);
        emailPanel.add(Box.createHorizontalStrut(15));


        emailPanel.add(new JLabel("Message: "));
        emailPanel.add(messageTextField);
        emailPanel.add(Box.createHorizontalStrut(15));

        emailPanel.add(new JLabel("cc: "));
        emailPanel.add(ccField);
        emailPanel.add(Box.createHorizontalStrut(15));


    }

    public Mail showEmailPanel() {

        int result = JOptionPane.showConfirmDialog(null, emailPanel, "Ändra rubriken på din applikation här", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        String subject = null;
        String to = null;
        String text = null;
        String cc = null;
        if (result == JOptionPane.OK_OPTION) {
            to = mailAdressField.getText();
            subject = subjectField.getText();
            text = messageTextField.getText();
            cc = ccField.getText();

            mailAdressField.setText("");
            subjectField.setText("");
            messageTextField.setText("");
            ccField.setText("");

            return new Mail(to, subject, text, cc);
        }
        return null;

    }

}

