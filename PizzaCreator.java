import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaCreator extends JFrame {
    private JPanel mainPanel;
    private JButton profileButton;
    private JLabel logoImage;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton pizzaButton;
    private JButton sidesButton;
    private JButton beveragesButton;
    private JPanel pizzaPanel;
    private JButton sizeSelection;
    private JButton crustSelection;
    private JRadioButton panRadioButton;
    private JRadioButton regularRButton;
    private JRadioButton smallRButton;
    private JRadioButton largeRButton;
    private JRadioButton thinRButton;
    private JButton checkOutButton;
    private JRadioButton mediumRButton;
    private JPanel quantityTab;
    private JTextArea quantityTextField;
    private JLabel quantityText;
    private JRadioButton m1RButton;
    private JRadioButton m2RButton;
    private JRadioButton m3RButton;
    private JRadioButton t1RButton;
    private JRadioButton t2RButton;
    private JRadioButton t3RButton;
    private JRadioButton t4RButton;
    private JRadioButton t5RButton;
    private JRadioButton t6RButton;
    private JButton addQuantityButton;
    private JButton minusQuantityButton;
    private JRadioButton m1WholeRButton;
    private JRadioButton m1LeftRButton;
    private JCheckBox m1FullRButton;
    private JRadioButton m1RightRButton;
    private JRadioButton m2LeftRButton;
    private JRadioButton m3LeftRButton;
    private JRadioButton t1LeftRButton;
    private JRadioButton t2LeftRButton;
    private JRadioButton t3LeftRButton;
    private JRadioButton t4LeftRButton;
    private JRadioButton t5LeftRButton;
    private JRadioButton t6LeftRButton;
    private JRadioButton m2WholeRButton;
    private JRadioButton m3WholeRButton;
    private JRadioButton t1WholeRButton;
    private JRadioButton t2WholeRButton;
    private JRadioButton t3WholeRButton;
    private JRadioButton t4WholeRButton;
    private JRadioButton t5WholeRButton;
    private JRadioButton t6WholeRButton;
    private JCheckBox m2FullRButton;
    private JRadioButton m2RightRButton;
    private JRadioButton m3RightRButton;
    private JRadioButton t1RightRButton;
    private JRadioButton t2RightRButton;
    private JRadioButton t3RightRButton;
    private JRadioButton t4RightRButton;
    private JRadioButton t5RightRButton;
    private JRadioButton t6RightRButton;

    static ArrayList<Pizza> userPizzaOrder = new ArrayList<Pizza>();

    public PizzaCreator(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080,720));

        this.pack();

        //Navigation
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame accountCreation = new Profile("Account Creator");
                dispose();
            }
        });
        sidesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sidesScreen = new Sides("Sides");
                dispose();
            }
        });

        //makes quantity text field and buttons work
        final int[] quantity = {1};
        this.quantityTextField.setText(String.valueOf(quantity[0]));
        this.minusQuantityButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] -1;
                if (quantity[0]<1) {
                    quantity[0] = 1;
                }
                quantityTextField.setText(String.valueOf(quantity[0]));
            }
        });
        this.addQuantityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0] = quantity[0] +1;
                quantityTextField.setText(String.valueOf(quantity[0]));
            }
        });

        //Button Groups
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallRButton);
        sizeGroup.add(mediumRButton);
        sizeGroup.add(largeRButton);
        ButtonGroup crustGroup = new ButtonGroup();
        crustGroup.add(thinRButton);
        crustGroup.add(regularRButton);
        crustGroup.add(panRadioButton);

        ButtonGroup m1Group = new ButtonGroup();
        m1Group.add(m1LeftRButton);
        m1Group.add(m1WholeRButton);
        m1Group.add(m1RightRButton);

        ButtonGroup m2Group = new ButtonGroup();
        m2Group.add(m2LeftRButton);
        m2Group.add(m2WholeRButton);
        m2Group.add(m2RightRButton);

        ButtonGroup m3Group = new ButtonGroup();
        m3Group.add(m3LeftRButton);
        m3Group.add(m3WholeRButton);
        m3Group.add(m3RightRButton);

        ButtonGroup t1Group = new ButtonGroup();
        t1Group.add(t1LeftRButton);
        t1Group.add(t1WholeRButton);
        t1Group.add(t1RightRButton);

        ButtonGroup t2Group = new ButtonGroup();
        t2Group.add(t2LeftRButton);
        t2Group.add(t2WholeRButton);
        t2Group.add(t2RightRButton);

        ButtonGroup t3Group = new ButtonGroup();
        t3Group.add(t3LeftRButton);
        t3Group.add(t3WholeRButton);
        t3Group.add(t3RightRButton);

        ButtonGroup t4Group = new ButtonGroup();
        t4Group.add(t4LeftRButton);
        t4Group.add(t4WholeRButton);
        t4Group.add(t4RightRButton);

        ButtonGroup t5Group = new ButtonGroup();
        t5Group.add(t5LeftRButton);
        t5Group.add(t5WholeRButton);
        t5Group.add(t5RightRButton);

        ButtonGroup t6Group = new ButtonGroup();
        t6Group.add(t6LeftRButton);
        t6Group.add(t6WholeRButton);
        t6Group.add(t6RightRButton);




        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPizzaOrder.add(saveOrder(quantity));

                for (int i=0; i<userPizzaOrder.size(); i++) {
                    System.out.println(userPizzaOrder.get(i));

                }
                JFrame sidesScreen = new Sides("Sides");
                dispose();
            }
        });

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
    }


    public Pizza saveOrder(int[] quantity) {
        //variables
        char size='n';
        char crust='n';
        int m1=0;
        int m2=0;
        int m3=0;
        int t1=0;
        int t2=0;
        int t3=0;
        int t4=0;
        int t5=0;
        int t6=0;
        int n = quantity[0];

        //Button Functionality
        if (smallRButton.isSelected()) {
            size = 's';
        }
        else if (mediumRButton.isSelected()) {
            size ='m';
        }
        else if (largeRButton.isSelected()) {
            size = 'l';
        }
        else {
            size = 'n';
        }
        if (thinRButton.isSelected()) {
            crust = 't';
        }
        else if (regularRButton.isSelected()) {
            crust = 'r';
        }
        else if (panRadioButton.isSelected()) {
            crust = 'p';
        }
        else {
            crust = 'n';
        }
        if (m1RButton.isSelected()) {
            if (m1LeftRButton.isSelected()) {
                m1 = 1;
            }
            else if (m1WholeRButton.isSelected()) {
                m1 = 2;
            }
            else if (m1RightRButton.isSelected()) {
                m1 = 3;
            }
        }
        if (m2RButton.isSelected()) {
            if (m2LeftRButton.isSelected()) {
                m2 = 1;
            }
            else if (m2WholeRButton.isSelected()) {
                m2 = 2;
            }
            else if (m2RightRButton.isSelected()) {
                m2 = 3;
            }
        }
        if (m3RButton.isSelected()) {
            if (m3LeftRButton.isSelected()) {
                m3 = 1;
            }
            else if (m3WholeRButton.isSelected()) {
                m3 = 2;
            }
            else if (m3RightRButton.isSelected()) {
                m3 = 3;
            }
        }
        if (t1RButton.isSelected()) {
            if (t1LeftRButton.isSelected()) {
                t1 = 1;
            }
            else if (t1WholeRButton.isSelected()) {
                t1 = 2;
            }
            else if (t1RightRButton.isSelected()) {
                t1 = 3;
            }
        }
        if (t2RButton.isSelected()) {
            if (t2LeftRButton.isSelected()) {
                t2 = 1;
            }
            else if (t2WholeRButton.isSelected()) {
                t2 = 2;
            }
            else if (t2RightRButton.isSelected()) {
                t2 = 3;
            }
        }
        if (t3RButton.isSelected()) {
            if (t3LeftRButton.isSelected()) {
                t3 = 1;
            }
            else if (t3WholeRButton.isSelected()) {
                t3 = 2;
            }
            else if (t3RightRButton.isSelected()) {
                t3 = 3;
            }
        }
        if (t4RButton.isSelected()) {
            if (t4LeftRButton.isSelected()) {
                t4 = 1;
            }
            else if (t4WholeRButton.isSelected()) {
                t4 = 2;
            }
            else if (t4RightRButton.isSelected()) {
                t4 = 3;
            }
        }
        if (t5RButton.isSelected()) {
            if (t5LeftRButton.isSelected()) {
                t5 = 1;
            }
            else if (t5WholeRButton.isSelected()) {
                t5 = 2;
            }
            else if (t5RightRButton.isSelected()) {
                t5 = 3;
            }
        }
        if (t6RButton.isSelected()) {
            if (t6LeftRButton.isSelected()) {
                t6 = 1;
            }
            else if (t6WholeRButton.isSelected()) {
                t6 = 2;
            }
            else if (t6RightRButton.isSelected()) {
                t6 = 3;
            }
        }

        return new Pizza(size, crust, m1,m2,m3,t1,t2,t3,t4,t5,t6,n);
    }


    public static void main(String[] args) {

        JFrame pizzaCreator = new PizzaCreator("Pizza Creation");





    }

}

