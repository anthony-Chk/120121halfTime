import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sides extends JFrame{
    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton sidesButton;
    private JButton pizzaButton;
    private JButton beveragesButton;
    private JPanel pizzaPanel;
    private JButton Breadsticks;
    private JButton BreakstickBites;
    private JButton BCCC;
    private JLabel breadstickImage;
    private JLabel Cookie;
    private JButton P1;
    private JButton P2;
    private JButton P3;
    private JLabel BreadbitesImage;
    private JPanel quantityTab;
    private JLabel quantityText;
    private JTextArea quantity2;
    private JButton plusquantity2;
    private JButton minusquantity2;
    private JTextArea Quantity1;
    private JButton plusquantity1;
    private JButton minusquantity1;
    private JRadioButton marinara1;
    private JRadioButton marinara2;
    private JButton NextPage;
    private JTextArea quantity3;
    private JButton plusquantity3;
    private JButton minusquantity3;

    public Sides(String name) {
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

        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pizza = new PizzaCreator("Pizza menu");
                dispose();
            }
        });
        sidesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sides = new Sides("side items");
                dispose();
            }
        });

        final int[] quantity = {0};
        this.Quantity1.setText(String.valueOf(quantity[0]));
        this.quantity2.setText(String.valueOf(quantity[0]));
        this.quantity3.setText(String.valueOf(quantity[0]));
        this.minusquantity1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] -1;
                if (quantity[0]<0) {
                    quantity[0] = 0;
                }
                Quantity1.setText(String.valueOf(quantity[0]));
            }
        });
        this.plusquantity1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] +1;
                Quantity1.setText(String.valueOf(quantity[0]));
            }
        });
        this.minusquantity2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] -1;
                if (quantity[0]<0) {
                    quantity[0] = 0;
                }
                quantity2.setText(String.valueOf(quantity[0]));
            }
        });
        this.plusquantity2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] +1;
                quantity2.setText(String.valueOf(quantity[0]));
            }
        });
        this.minusquantity3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] -1;
                if (quantity[0]<0) {
                    quantity[0] = 0;
                }
                quantity3.setText(String.valueOf(quantity[0]));
            }
        });
        this.plusquantity3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] +1;
                quantity3.setText(String.valueOf(quantity[0]));
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame accountCreation = new Profile("Account Creator");
                dispose();
            }
        });
        beveragesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame drinks = new Drinks("beverages");
                dispose();
            }
        });
    }
    public static void main(String[] args)
    {
        JFrame sides = new Sides("side items");
    }
}
