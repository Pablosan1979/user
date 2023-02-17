
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton boton1;

    public Formulario() {

        setLayout(null);
        label1 = new JLabel("Usuario");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(120, 10, 150, 20);
        add(textfield1);
        label2 = new JLabel("Nombre");
        label2.setBounds(10, 30, 100, 30);
        add(label2);
        textfield2 = new JTextField();
        textfield2.setBounds(120, 30, 150, 20);
        add(textfield2);
        label3 = new JLabel("Contraseña");
        label3.setBounds(10, 50, 100, 30);
        add(label3);
        textfield3 = new JTextField();
        textfield3.setBounds(120, 50, 150, 20);
        add(textfield3);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cad = textfield1.getText();            
            String cad2 = textfield2.getText();            
            String cad3 = textfield3.getText();
            setTitle("User "+cad+" Name  "+cad2+" Pswd "+cad3);
                        
        }
    }

    public static void main(String[] args) {
        Formulario user1 = new Formulario();
        user1.setBounds(0, 0, 300, 170);
        user1.setVisible(true);
        user1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
