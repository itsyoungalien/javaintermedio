package tutos.interfazgrafica;
import java.awt.event.*;
import javax.swing.*;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 25/07/2023
 */
public class Interfaz1 extends JFrame implements ActionListener{
    private JLabel label;
    private JTextField txtfield;
    private JButton boton;

    public Interfaz1(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Mensaje:");
        label.setBounds(15,10,100,30);
        add(label);

        txtfield = new JTextField();
        txtfield.setBounds(80,16,190,20);
        add(txtfield);

        boton = new JButton("Mostrar");
        boton.setBounds(10,60,100,30);
        add(boton);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){
            String cadena = txtfield.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
    public static void main(String[] args){
        Interfaz1 ventana = new Interfaz1();
        ventana.setBounds(0,0,300,150);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}