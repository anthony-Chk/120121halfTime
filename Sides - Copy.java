import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    private JButton Checkout;
    private JTextArea quantity3;
    private JButton plusquantity3;
    private JButton minusquantity3;

    final int[] quantityNum = {0};
    final int[] quantityNum2 = {0};
    final int[] quantityNum3 = {0};



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
        beveragesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame drinks = new Drinks("Beverages");
                dispose();
            }
        });
        Checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame drinks = new Drinks("Beverages");
                dispose();
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
                dispose();
            }
        });

        final int[] quantityNum = {0};
        final int[] quantityNum2 = {0};
        final int[] quantityNum3 = {0};

        this.Quantity1.setText(String.valueOf(quantityNum[0]));
        this.quantity2.setText(String.valueOf(quantityNum[0]));
        this.quantity3.setText(String.valueOf(quantityNum[0]));
        this.minusquantity1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum[0] = quantityNum[0] -1;
                if (quantityNum[0]<0) {
                    quantityNum[0] = 0;
                }
                Quantity1.setText(String.valueOf(quantityNum[0]));
            }
        });
        this.plusquantity1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum[0] = quantityNum[0] +1;
                Quantity1.setText(String.valueOf(quantityNum[0]));
            }
        });
        this.minusquantity2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum2[0] = quantityNum2[0] -1;
                if (quantityNum2[0]<0) {
                    quantityNum2[0] = 0;
                }
                quantity2.setText(String.valueOf(quantityNum2[0]));
            }
        });
        this.plusquantity2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum2[0] = quantityNum2[0] +1;
                quantity2.setText(String.valueOf(quantityNum2[0]));
            }
        });
        this.minusquantity3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum3[0] = quantityNum3[0] -1;
                if (quantityNum3[0]<0) {
                    quantityNum3[0] = 0;
                }
                quantity3.setText(String.valueOf(quantityNum3[0]));
            }
        });
        this.plusquantity3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum3[0] = quantityNum3[0] +1;
                quantity3.setText(String.valueOf(quantityNum3[0]));
            }
        });
    }

    public Sides(String name, Pizza input) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        //NEW CODE
        System.out.println(input.toString());

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
                JFrame sides = new Sides("Side items");
                dispose();
            }
        });
        beveragesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame drinks = new Drinks("Beverages");
                dispose();
            }
        });
        Checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Side s = saveOrder();
                JFrame drinks = new Drinks("Beverages", input, s);
                dispose();
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
                dispose();
            }
        });



        this.Quantity1.setText(String.valueOf(quantityNum[0]));
        this.quantity2.setText(String.valueOf(quantityNum[0]));
        this.quantity3.setText(String.valueOf(quantityNum[0]));
        this.minusquantity1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum[0] = quantityNum[0] -1;
                if (quantityNum[0]<0) {
                    quantityNum[0] = 0;
                }
                Quantity1.setText(String.valueOf(quantityNum[0]));
            }
        });
        this.plusquantity1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum[0] = quantityNum[0] +1;
                Quantity1.setText(String.valueOf(quantityNum[0]));
            }
        });
        this.minusquantity2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum2[0] = quantityNum2[0] -1;
                if (quantityNum2[0]<0) {
                    quantityNum2[0] = 0;
                }
                quantity2.setText(String.valueOf(quantityNum2[0]));
            }
        });
        this.plusquantity2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum2[0] = quantityNum2[0] +1;
                quantity2.setText(String.valueOf(quantityNum2[0]));
            }
        });
        this.minusquantity3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantityNum3[0] = quantityNum3[0] -1;
                if (quantityNum3[0]<0) {
                    quantityNum3[0] = 0;
                }
                quantity3.setText(String.valueOf(quantityNum3[0]));
            }
        });
        this.plusquantity3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantityNum3[0] = quantityNum3[0] +1;
                quantity3.setText(String.valueOf(quantityNum3[0]));
            }
        });
    }

    public Side saveOrder() {
        boolean s1m;
        boolean s2m;
        int s1Q;
        int s2Q;
        int s3Q;
        String temp;

        if (marinara1.isSelected() == true) {
            s1m = true;
        } else {
            s1m = false;
        }

        if (marinara2.isSelected() == true) {
            s2m = true;
        } else {
            s2m = false;
        }

        s1Q = quantityNum[0];
        s2Q = quantityNum2[0];
        s3Q = quantityNum3[0];

        return new Side(s1m, s2m, s1Q, s2Q, s3Q);
    }


}
