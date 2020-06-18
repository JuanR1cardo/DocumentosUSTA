package sistemas;

import javax.swing.*;
import java.awt.*;

public class form_egresados extends JDialog {
    public form_egresados (java.awt.Frame parent){
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu= new JLabel("List all graduates", SwingConstants.CENTER);
        panel_superior.add(label_menu);
        String[] columnsNames ={"ID", "name", "Faculty", "graduation_date"};
        file_egresados file_data_proyecto1=new file_egresados ();
        JTable tabla_datos= new JTable(file_data_proyecto1.f_all_data_proyecto(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();

    }
}
