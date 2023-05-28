import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loged extends JFrame implements ActionListener {
    public Loged() {
        this.initialize();
        JPanel formPanel = new JPanel();
        formPanel.add(lbl1);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(btnBack);

        btnBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new App();
            }

        });

        getContentPane().setBackground(Color.GRAY);
        getContentPane().add(formPanel, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        pack();
    }

    private JLabel lbl1 = new JLabel("Bienvenido");
    private JButton btnBack = new JButton("Cerrar Sesión");
    final private Font mainFont = new Font("Helvetica", Font.BOLD, 20);

    void initialize() {
        lbl1.setFont(mainFont);
        btnBack.setFont(mainFont);

        setLocationRelativeTo(null);
        setTitle(" Login ");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
