import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    public App() {
        this.initialize();
        lblImage.setIcon(new ImageIcon("img/login.png"));
        lblImage.setBounds(270, 10, 200, 70);
        lblURL.setText("Olvidé mi contraseña");

        JPanel iconPanel = new JPanel(new GridLayout(1, 1, 5, 5));
        iconPanel.add(lblImage);
        iconPanel.add(lbl1);

        JPanel mainPanel = new JPanel(new GridLayout(7, 1, 5, 5));
        mainPanel.add(lbl1);
        mainPanel.add(lblUser);
        mainPanel.add(txtUser);
        mainPanel.add(lblPassword);
        mainPanel.add(txtPassword);
        mainPanel.add(chbox);
        mainPanel.add(lblURL);

        JPanel buttonsPanel = new JPanel(new GridLayout());
        buttonsPanel.add(btnEntry);

        btnEntry.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String infoUser = txtUser.getText();
                String infoPassword = txtPassword.getText();
                if (infoUser.equals(user) && infoPassword.equals(password)) {
                    setVisible(false);
                    new Loged();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                }
            }
        });

        getContentPane().setBackground(Color.GRAY);
        getContentPane().add(iconPanel, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        pack();
    }

    private JLabel lbl1 = new JLabel(" Inicio de Sesión ");
    private JLabel lblUser = new JLabel("Usuario: ");
    private JLabel lblPassword = new JLabel("Contraseña: ");
    private JTextField txtUser = new JTextField("user");
    private JPasswordField txtPassword = new JPasswordField("password");
    private JButton btnEntry = new JButton("Entrar");
    // private Icon img = new ImageIcon(getClass().getResource("img/login.png"));
    private JLabel lblImage = new JLabel();
    private URLabel lblURL = new URLabel();
    private Checkbox chbox = new Checkbox("Recúerdame");
    final private Font mainFont = new Font("Helvetica", Font.BOLD, 20);

    final private String user = "user";
    final private String password = "password";

    void initialize() {
        lbl1.setFont(mainFont);
        lblUser.setFont(mainFont);
        lblPassword.setFont(mainFont);
        btnEntry.setFont(mainFont);

        setLocationRelativeTo(null);
        setTitle(" Login ");
        setSize(400, 400);
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
