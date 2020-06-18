package sistemas;

import javax.swing.*;
import java.awt.*;

public class file_data_acerdade extends JFrame {
    public file_data_acerdade(){
        setLayout(new BorderLayout());
        JPanel panel_superior =new JPanel();
        JLabel label_menu= new JLabel("Acerca de:",SwingConstants.CENTER);
        panel_superior.add(label_menu);
        JPanel panel_central =new JPanel();
        JLabel label_maker= new JLabel(" Juan Ricardo Torres Céspedes ,  juanr.torresc@usantoto.edu.co",SwingConstants.CENTER);
        panel_central.add(label_maker);
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("img/ricardo.png"));
        JLabel logo2 = new JLabel();
        logo2.setIcon(new ImageIcon("img/logo.png"));
        JPanel panelfoto = new JPanel();
        panelfoto.add(logo);
        panelfoto.add(logo2);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.WEST);
        add(panelfoto,BorderLayout.SOUTH);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
    }
}
