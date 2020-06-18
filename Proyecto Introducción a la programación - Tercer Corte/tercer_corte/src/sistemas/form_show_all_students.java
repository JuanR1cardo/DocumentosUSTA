package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 21/04/2020
	  Description: This software calculates determined values for N products
	 */
import javax.swing.*;
import java.awt.*;

public class form_show_all_students extends JDialog {
    public  form_show_all_students (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("List of Students", SwingConstants.CENTER);
        panel_superior.add(label_menu);
        String[] columnsNames ={"Name", "Lastname","Faculty"};
        file_data_students file_data_student1=new file_data_students();
        JTable tabla_datos= new JTable(file_data_student1.f_all_data_students(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        setSize(800,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();

    }
}
