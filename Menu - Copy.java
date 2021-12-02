import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel HomePage;
    private JLabel logoImage;
    private JButton StartButton;
    private JButton MenuButton;
    private JButton ContactButton;
    private JButton LoginButton;


    public Menu(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(HomePage);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        //Navigation
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame loginScreen = new Login("Login");
                dispose();
            }
        });

        MenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fullMenu = new FullMenu("Menu");
                dispose();
            }
        });

        ContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame contactUs = new Contact("Contact Us");
                dispose();
            }
        });

        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pizzaCreator = new PizzaCreator("Pizza Creator");
                dispose();
            }
        });
    }

    public static void main(String[] args) {

        JFrame mainMenu = new Menu("Main Menu");

    }
}
