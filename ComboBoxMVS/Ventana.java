package ComboBoxMVS;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModelo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 400);
        setLayout(new FlowLayout());
        lblNombre = new JLabel("Ingresa un nombre:");
        this.getContentPane().add(lblNombre);
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);
        //Configurar el modelo

        modelo = new NombreModelo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");

        combo = new JComboBox(modelo);
        this.getContentPane().add(combo);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtNombre.getText();
                modelo.agregarNombre(nuevo);
                txtNombre.setText("");
            }
        });
        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null, "hola" + combo.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana("Combobox MVC");
    }
}
