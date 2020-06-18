package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 18/06/2020
	  Description: This software determines the graduates profile (name, identification card, faculty and graduation year.
	 */
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    public form_menu() {
        JLabel label_menu = new JLabel("version JAVA - SAC", SwingConstants.CENTER);
        label_menu.setBounds(200, 10, 200, 50);
        add(label_menu);
        JLabel label_maker = new JLabel("Creado por: Juan Ricardo Torres Céspedes", SwingConstants.LEFT);
        label_maker.setBounds(5, 300, 500, 20);
        add(label_maker);
        JButton boton_iniciar = new JButton("INICIAR");
        boton_iniciar.setBounds(250, 150, 120, 40);
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                form_principal form_principal1 = new form_principal();
                setVisible(false);
            }
        });
        add(boton_iniciar);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


