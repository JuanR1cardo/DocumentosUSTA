package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 21/04/2020
	  Description: This software calculates determined values for N products
	 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal () {
        setTitle("JAVA - SAC (versión 1.0)");
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        panel_superior.add(label_menu);
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_estudent form_estudent1 = new form_estudent();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        JButton boton_formulario3 = new JButton("Egresados");
        boton_formulario3.setBounds(0, 0, 100, 30);
        boton_formulario3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                form_egrsadoss form_egrsadoss1 = new form_egrsadoss();
            }
        });
        panel_izquierdo.add(boton_formulario3);
        panel_izquierdo.add(boton_formulario1);
        JButton boton_formulario4 = new JButton("List all graduates");
        boton_formulario4.setBounds(0, 0, 100, 30);
        boton_formulario4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                f_abrir_form_egrasados(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario4);
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
               form_show_all_students(actionEvent);
            }
        });

        panel_izquierdo.add(boton_formulario2);
        JButton boton_acercade = new JButton("Acerca de");
        boton_acercade.setBounds(0, 0, 100, 50);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                file_data_acerdade file_data_acerdade1 = new file_data_acerdade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Juan Ricardo Torres Céspedes"));
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 642, 700);
        setLocationRelativeTo(null);
    }
    private void  form_show_all_students (java.awt.event.ActionEvent evt) {
        form_show_all_students form_show_all_student1 = new form_show_all_students(this);
    }
    private void f_abrir_form_egrasados (java.awt.event.ActionEvent evt){
        form_egresados form_egresados1 = new form_egresados(this);

    }
}
