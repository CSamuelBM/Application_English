package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class Vista extends JFrame{
    
    public Vista(){
        configuracion();
    }

    private void configuracion() {
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        titulo();
        PnBotones pnBotones = new PnBotones();
        PnContenido pnContenido = new PnContenido();
        
        add(pnBotones, BorderLayout.WEST);
        add(pnContenido, BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }

    private void titulo() {
        JPanel pnTitulo = new JPanel();
        pnTitulo.setBackground(new Color(71, 156, 252));
        pnTitulo.setBorder(BorderFactory.createLineBorder(new Color(117, 173, 255), 2, true));
        
        JLabel lbTitulo = new JLabel("Learn the basics of ENGLISH", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        
        pnTitulo.add(lbTitulo);
        add(pnTitulo, BorderLayout.NORTH);
    }
    
}
