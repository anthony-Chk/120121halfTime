import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentMethod extends JFrame {
    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton saveButton;
    private JTextField textField1;
    private JTextField zTextField;
    private JTextField textField2;

    public PaymentMethod(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menu = new Menu("Menu");
                dispose();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fullMenu = new FullMenu("Full Menu");
                dispose();
            }
        });
        contactUsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame contact = new Contact("Contact Us");
                dispose();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame save = new Profile("profile");
                dispose();
            }
        });
    }
}
