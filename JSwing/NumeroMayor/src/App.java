import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Elabora un programa que dentro del JFrame realice una evaluación 2 números y visualice como resultado el mayor de los 2 números.

public class App extends JFrame implements ActionListener {
    private static String numberOne, numberTwo;
    private static JLabel lbl1 = new JLabel("Número 1");
    private static JLabel lbl2 = new JLabel("Número 2");
    private static JLabel lbl3 = new JLabel("   Calcuar el número mayor");
    private static JLabel lbl4 = new JLabel("El número mayor es:     ");
    private static JTextField txtNum1 = new JTextField();
    private static JTextField txtNum2 = new JTextField();
    private static JButton btnCalc = new JButton("Calcular");
    private static JButton btnClear = new JButton("Limpiar");
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);

    public App() {
        this.initialize();
        /***** PANEL FORM *****/
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbl1);
        formPanel.add(txtNum1);
        formPanel.add(lbl2);
        formPanel.add(txtNum2);
        formPanel.add(lbl4);

        /***** BUTTONS FORM *****/
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnCalc);
        buttonsPanel.add(btnClear);

        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                numberOne = txtNum1.getText();
                numberTwo = txtNum2.getText();

                int num1 = Integer.valueOf(numberOne);
                int num2 = Integer.valueOf(numberTwo);

                if (num1 > num2) {
                    lbl4.setText("El número mayor es: " + numberOne);
                } else {
                    lbl4.setText("El número mayor es: " + numberTwo);
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
                lbl4.setText("El número mayor es:     ");
            }
        });

        getContentPane().setBackground(Color.GRAY);
        getContentPane().add(lbl3, BorderLayout.NORTH);
        getContentPane().add(formPanel, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        pack();
    }

    public void initialize() {
        lbl3.setFont(mainFont);
        lbl1.setFont(mainFont);
        txtNum1.setFont(mainFont);
        lbl2.setFont(mainFont);
        txtNum2.setFont(mainFont);
        lbl4.setFont(mainFont);

        btnCalc.setFont(mainFont);
        btnClear.setFont(mainFont);

        setLocationRelativeTo(null);
        setTitle("Welcome");
        setSize(600, 350);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(600, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
