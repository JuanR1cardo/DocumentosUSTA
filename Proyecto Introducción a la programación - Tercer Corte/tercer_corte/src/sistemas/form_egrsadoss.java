package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 21/04/2020
	  Description: This software calculates determined values for N products
	 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_egrsadoss extends JFrame {
    JTextField text_ID,text_name,text_faculty,text_graduation_date;
    public form_egrsadoss(){
        setLayout(new BorderLayout());
        JPanel panel_superior =new JPanel();
        JLabel label_menu= new JLabel("Egresados",SwingConstants.CENTER);
        panel_superior.add(label_menu);
        JPanel panel_central =new JPanel();
        panel_central.setLayout(new GridLayout(5, 2));
        panel_central.add(new JLabel(""));panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("ID: "));
        panel_central.add(text_ID = new JTextField(""));
        panel_central.add(new JLabel("name : "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        panel_central.add(new JLabel("graduation_date: "));
        panel_central.add(text_graduation_date=new JTextField(""));
        JPanel panel_inferior =new JPanel();
        JButton boton_crear = new JButton("CREAR");
        boton_crear.setBounds(0,0,100,50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_crear_nuevo_estudiante(actionEvent);
            }
        });
        panel_inferior.add(boton_crear);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        add(panel_inferior,BorderLayout.SOUTH);
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void f_crear_nuevo_estudiante(java.awt.event.ActionEvent evt){
        final JDialog ventana_emergente = new JDialog(this,"Save data",true);
        if(text_name.getText().length()<10 ||
                text_ID.getText().length()<10 ||
                text_faculty.getText().length()<8 ||
                text_graduation_date.getText().length()<4){
            ventana_emergente.add(new JLabel("ID: debe tener como minimo 10 digitos " +
                    "\n name: debe tener como minimo 10 digitos " +
                    "\n Faculty: debe tener como minimo 8 caracteres " +
                    "\n graduation_date: solo numeros "));
        }else{
            file_egresados file_egresados1= new file_egresados();
            boolean rpta=file_egresados1.file_egresados(text_name.getText(),text_faculty.getText()
                    ,text_ID.getText(),text_graduation_date.getText());
            if(rpta==true){
                ventana_emergente.add(new JLabel(" GUARDADOS "));
                text_name.setText("");
                text_ID.setText("");
                text_graduation_date.setText("");
                text_faculty.setText("");
            }else{
                ventana_emergente.add(new JLabel("los datos NO pueden ser guardados en el archivo"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }

}
