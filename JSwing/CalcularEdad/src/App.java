import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;

public class App extends JFrame implements ActionListener {
    // Realizar un programa que calcule la edad de una persona basada en la fecha de
    // nacimiento, deberá capturar la fecha de nacimiento en campos de texto

    public App() {
        this.initialize();
        /* PANEL FORM */
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 3, 5, 5));
        formPanel.add(lblday);
        formPanel.add(txtday);
        formPanel.add(lblmonth);
        formPanel.add(txtmonth);
        formPanel.add(lblyear);
        formPanel.add(txtyear);
        formPanel.add(lbl2);

        /* BUTTONS FORM */
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout());
        buttonsPanel.add(btnClear);
        buttonsPanel.add(btnCalc);

        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int day = Integer.parseInt(txtday.getText());
                int month = Integer.parseInt(txtmonth.getText());
                int year = Integer.parseInt(txtyear.getText());

                LocalDate today = LocalDate.now();
                LocalDate birthDate = LocalDate.of(year, month, day);
                Period age = Period.between(birthDate, today);

                lbl2.setText("Tu edad es:  " + (age.getYears()));
            }
        });

        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtday.setText("");
                txtmonth.setText("");
                txtyear.setText("");
                lbl2.setText("Tu edad es:  ");
            }
        });

        getContentPane().setBackground(Color.GRAY);
        getContentPane().add(lbl1, BorderLayout.LINE_START);
        getContentPane().add(formPanel, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        pack();
    }

    private JLabel lbl1 = new JLabel("CALCULADORA DE AÑOS ");
    private JLabel lbl2 = new JLabel("Tu edad es:  ");
    private JLabel lblday = new JLabel(" Introduce el día de nacimiento: ");
    private JLabel lblmonth = new JLabel(" Introduce el mes de nacimiento: ");
    private JLabel lblyear = new JLabel(" Introduce el año de nacimiento: ");
    private JTextField txtday = new JTextField("");
    private JTextField txtmonth = new JTextField("");
    private JTextField txtyear = new JTextField("");
    private JButton btnCalc = new JButton("Calcular");
    private JButton btnClear = new JButton("Limpiar");
    final private Font mainFont = new Font("Agency FB", Font.BOLD, 18);

    void initialize() {
        lbl1.setFont(mainFont);
        lbl2.setFont(mainFont);
        txtday.setFont(mainFont);
        txtmonth.setFont(mainFont);
        txtyear.setFont(mainFont);
        btnCalc.setFont(mainFont);
        btnClear.setFont(mainFont);

        setLocationRelativeTo(null);
        setTitle("Calculadora de Años");
        setSize(600, 350);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
