import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Drinks extends JFrame {
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
    private JButton Beverages;
    private JTextArea regularRButton;
    private JTextArea thinRButton;
    private JTextArea largeRButton;
    private JTextArea smallRButton;
    private JTextArea mediumRButton;
    private JButton d1MinusButton;
    private JTextArea lemonadeTextArea;
    private JTextArea qTextField;
    private JButton checkOutButton;
    private JTextArea qTextField2;
    private JTextArea qTextField3;
    private JTextArea qTextField4;
    private JTextArea qTextField5;
    private JTextArea qTextField6;
    private JTextArea qTextField7;
    private JButton d3MinusButton;
    private JButton d2MinusButton;
    private JButton d4MinusButton;
    private JButton d5MinusButton;
    private JButton d6MinusButton;
    private JButton d7MinusButton;
    private JButton d1AddButton;
    private JButton d2AddButton;
    private JButton d3AddButton;
    private JButton d4AddButton;
    private JButton d5AddButton;
    private JButton d6AddButton;
    private JButton d7AddButton;
    private JComboBox d1Size;
    private JComboBox d2Size;
    private JComboBox d3Size;
    private JComboBox d4Size;
    private JComboBox d5Size;
    private JComboBox d6Size;
    private JComboBox d7Size;

    final int[] quantity1 = {0};
    final int[] quantity2 = {0};
    final int[] quantity3 = {0};
    final int[] quantity4 = {0};
    final int[] quantity5 = {0};
    final int[] quantity6 = {0};
    final int[] quantity7 = {0};


    public Drinks(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        //Navigation
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
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
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
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pizza = new PizzaCreator("Pizza menu");
                dispose();
            }
        });

        //Quantity Buttons
        final int[] quantity1 = {0};
        this.qTextField.setText(String.valueOf(quantity1[0]));
        this.d1MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity1[0] = quantity1[0] -1;
                if (quantity1[0]<0) {
                    quantity1[0] = 0;
                }
                qTextField.setText(String.valueOf(quantity1[0]));
            }
        });
        this.d1AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity1[0] = quantity1[0] +1;
                qTextField.setText(String.valueOf(quantity1[0]));
            }
        });
        //Drink 2
        final int[] quantity2 = {0};
        this.qTextField2.setText(String.valueOf(quantity2[0]));
        this.d2MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity2[0] = quantity2[0] -1;
                if (quantity2[0]<0) {
                    quantity2[0] = 0;
                }
                qTextField2.setText(String.valueOf(quantity2[0]));
            }
        });
        this.d2AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity2[0] = quantity2[0] +1;
                qTextField2.setText(String.valueOf(quantity2[0]));
            }
        });
        //Drink 3
        final int[] quantity3 = {0};
        this.qTextField3.setText(String.valueOf(quantity3[0]));
        this.d3MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity3[0] = quantity3[0] -1;
                if (quantity3[0]<0) {
                    quantity3[0] = 0;
                }
                qTextField3.setText(String.valueOf(quantity3[0]));
            }
        });
        this.d3AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity3[0] = quantity3[0] +1;
                qTextField3.setText(String.valueOf(quantity3[0]));
            }
        });
        //Drink 4
        final int[] quantity4 = {0};
        this.qTextField4.setText(String.valueOf(quantity4[0]));
        this.d4MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity4[0] = quantity4[0] -1;
                if (quantity4[0]<0) {
                    quantity4[0] = 0;
                }
                qTextField4.setText(String.valueOf(quantity4[0]));
            }
        });
        this.d4AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity4[0] = quantity4[0] +1;
                qTextField4.setText(String.valueOf(quantity4[0]));
            }
        });
        //Drink 5
        final int[] quantity5 = {0};
        this.qTextField5.setText(String.valueOf(quantity5[0]));
        this.d5MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity5[0] = quantity5[0] -1;
                if (quantity5[0]<0) {
                    quantity5[0] = 0;
                }
                qTextField5.setText(String.valueOf(quantity5[0]));
            }
        });
        this.d5AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity5[0] = quantity5[0] +1;
                qTextField5.setText(String.valueOf(quantity5[0]));
            }
        });
        //Drink 6
        final int[] quantity6 = {0};
        this.qTextField6.setText(String.valueOf(quantity6[0]));
        this.d6MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity6[0] = quantity6[0] -1;
                if (quantity6[0]<0) {
                    quantity6[0] = 0;
                }
                qTextField6.setText(String.valueOf(quantity6[0]));
            }
        });
        this.d6AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity6[0] = quantity6[0] +1;
                qTextField6.setText(String.valueOf(quantity6[0]));
            }
        });
        //Drink 7
        final int[] quantity7 = {0};
        this.qTextField7.setText(String.valueOf(quantity7[0]));
        this.d7MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity7[0] = quantity7[0] -1;
                if (quantity7[0]<0) {
                    quantity7[0] = 0;
                }
                qTextField7.setText(String.valueOf(quantity7[0]));
            }
        });
        this.d7AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity7[0] = quantity7[0] +1;
                qTextField7.setText(String.valueOf(quantity7[0]));
            }
        });

    }

    public Drinks(String name, Pizza pInput, Side sInput) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        //Navigation
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
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
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
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pizza = new PizzaCreator("Pizza menu");
                dispose();
            }
        });
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drink dInput = saveOrder();
                JFrame orderScreen = new Myorder("Shopping Cart", pInput, sInput, dInput);
                dispose();
            }
        });

        //Quantity Buttons
        this.qTextField.setText(String.valueOf(quantity1[0]));
        this.d1MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity1[0] = quantity1[0] -1;
                if (quantity1[0]<0) {
                    quantity1[0] = 0;
                }
                qTextField.setText(String.valueOf(quantity1[0]));
            }
        });
        this.d1AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity1[0] = quantity1[0] +1;
                qTextField.setText(String.valueOf(quantity1[0]));
            }
        });
        //Drink 2
        this.qTextField2.setText(String.valueOf(quantity2[0]));
        this.d2MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity2[0] = quantity2[0] -1;
                if (quantity2[0]<0) {
                    quantity2[0] = 0;
                }
                qTextField2.setText(String.valueOf(quantity2[0]));
            }
        });
        this.d2AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity2[0] = quantity2[0] +1;
                qTextField2.setText(String.valueOf(quantity2[0]));
            }
        });
        //Drink 3
        this.qTextField3.setText(String.valueOf(quantity3[0]));
        this.d3MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity3[0] = quantity3[0] -1;
                if (quantity3[0]<0) {
                    quantity3[0] = 0;
                }
                qTextField3.setText(String.valueOf(quantity3[0]));
            }
        });
        this.d3AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity3[0] = quantity3[0] +1;
                qTextField3.setText(String.valueOf(quantity3[0]));
            }
        });
        //Drink 4
        this.qTextField4.setText(String.valueOf(quantity4[0]));
        this.d4MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity4[0] = quantity4[0] -1;
                if (quantity4[0]<0) {
                    quantity4[0] = 0;
                }
                qTextField4.setText(String.valueOf(quantity4[0]));
            }
        });
        this.d4AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity4[0] = quantity4[0] +1;
                qTextField4.setText(String.valueOf(quantity4[0]));
            }
        });
        //Drink 5
        this.qTextField5.setText(String.valueOf(quantity5[0]));
        this.d5MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity5[0] = quantity5[0] -1;
                if (quantity5[0]<0) {
                    quantity5[0] = 0;
                }
                qTextField5.setText(String.valueOf(quantity5[0]));
            }
        });
        this.d5AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity5[0] = quantity5[0] +1;
                qTextField5.setText(String.valueOf(quantity5[0]));
            }
        });
        //Drink 6
        this.qTextField6.setText(String.valueOf(quantity6[0]));
        this.d6MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity6[0] = quantity6[0] -1;
                if (quantity6[0]<0) {
                    quantity6[0] = 0;
                }
                qTextField6.setText(String.valueOf(quantity6[0]));
            }
        });
        this.d6AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity6[0] = quantity6[0] +1;
                qTextField6.setText(String.valueOf(quantity6[0]));
            }
        });
        //Drink 7
        this.qTextField7.setText(String.valueOf(quantity7[0]));
        this.d7MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity7[0] = quantity7[0] -1;
                if (quantity7[0]<0) {
                    quantity7[0] = 0;
                }
                qTextField7.setText(String.valueOf(quantity7[0]));
            }
        });
        this.d7AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity7[0] = quantity7[0] +1;
                qTextField7.setText(String.valueOf(quantity7[0]));
            }
        });

    }

    public Drink saveOrder() {
        int drink1 = quantity1[0];
        int drink2 = quantity2[0];
        int drink3 = quantity3[0];
        int drink4 = quantity4[0];
        int drink5 = quantity5[0];
        int drink6 = quantity6[0];
        int drink7 = quantity7[0];

        int d1Siz = d1Size.getSelectedIndex();
        int d2Siz = d2Size.getSelectedIndex();
        int d3Siz = d3Size.getSelectedIndex();
        int d4Siz = d4Size.getSelectedIndex();
        int d5Siz = d5Size.getSelectedIndex();
        int d6Siz = d6Size.getSelectedIndex();
        int d7Siz = d7Size.getSelectedIndex();

        return new Drink(drink1, drink2, drink3, drink4, drink5, drink6, drink7, d1Siz, d2Siz, d3Siz, d4Siz, d5Siz, d6Siz, d7Siz);

    }
}
