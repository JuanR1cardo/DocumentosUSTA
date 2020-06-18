package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 21/04/2020
	  Description: This software calculates determined values for N products
	 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_estudent extends JFrame {
    JTextField text_name, text_lastname, text_faculty;

    public form_estudent () {
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("New Student", SwingConstants.CENTER);
        panel_superior.add(label_menu);
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("lastName: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0, 0, 100, 50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                f_crear_nuevo_estudiante(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public void f_crear_nuevo_estudiante (java.awt.event.ActionEvent evt) {
        final JDialog ventana_emergente = new JDialog(this, "Save data", true);
        if (text_name.getText().length() < 3 ||
                text_lastname.getText().length() < 3 ||
                text_faculty.getText().length() < 3) {
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo 3 caracteres"));
        } else {
            file_data_students file_data_student1 = new file_data_students();
            boolean rpta = file_data_student1.f_add_student(text_faculty.getText(),text_name.getText(),text_lastname.getText());
            if (rpta == true) {
                ventana_emergente.add(new JLabel("Los datos fueron guardados de manera correcta"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
            } else {
                ventana_emergente.add(new JLabel("La información ingresada no puede ser añadida en: C:/ejercicios.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}
