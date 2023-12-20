package LP6;

/**
 * LP6
 * @author Melina Ojeda
 * 
 *  
 */

import javax.swing.*;
import java.awt.event.*;
public class Formulario4 extends JFrame implements ActionListener {
    JLabel boton1;
    public Formulario4() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerFormed(ActionEvent e) {
        if(e.getSource()==boton1) {
            system.exit(0);
        }
    }

    public static void main(String[] ar) {
        Formulario3 formulario1=new Formulario3();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
