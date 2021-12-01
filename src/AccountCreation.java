import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountCreation extends JFrame{
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton MenuButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JPasswordField passField2;
    private JPasswordField passField;
    private JTextField cardField;
    private JTextField expField;
    private JTextField cvvfield;
    private JTextField addressField;
    private JLabel errorField;
    private JButton saveButton;

    public AccountCreation(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkInformation();

            }
        });

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menu = new Menu("Menu");
                dispose();
            }
        });
        MenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fullMenu = new FullMenu("Full Menu");
                dispose();
            }
        });
    }
    public void checkInformation() {
        String tempString;
        char[] tempPass;

        errorField.setText("");

        tempString = emailField.getText();
        if (tempString.indexOf('@') == -1) {
            errorField.setText("Invalid email address");
        }

        tempString = phoneField.getText();
        if (tempString.length()>10 || tempString.length()<10) {
            errorField.setText("Invalid phone number");
        }

        tempPass = passField.getPassword();
        for (int i=0; i<tempPass.length+1; i++) {
            if (tempPass[i] != passField2.getPassword()[i]) {
                errorField.setText("Passwords do not match");
            }
        }

    }


    public void saveInformation() {

    }

    public static void main(String[] args) {
        JFrame frame = new AccountCreation("Account Creation");
    }
}
