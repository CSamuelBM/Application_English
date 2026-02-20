package App_Ingles;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Vista extends JFrame{
    
    private JLabel lbTitulo;
    
    public Vista(){
        configuracion();
    }

    private void configuracion() {
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        titulo();
        paneles();
        icono();
        
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void titulo() {
        JPanel pnTitulo = new JPanel();
        pnTitulo.setBackground(new Color(71, 156, 252));
        pnTitulo.setBorder(BorderFactory.createLineBorder(new Color(117, 173, 255), 2, true));
        
        JPanel pnContenido = new JPanel();
        pnContenido.setLayout(new BoxLayout(pnContenido, BoxLayout.X_AXIS));
        pnContenido.setBackground(new Color(71, 156, 252));
        
        lbTitulo = new JLabel("Learn the basics of ENGLISH", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        
        URL url = getClass().getResource("/Recursos/imgP.png");
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(img);
        setIconImage(img);
        
        JLabel lbUsuario = new JLabel();
        lbUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lbUsuario.setIcon(icono);
        
        lbUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnContenido.add(lbUsuario);
        pnContenido.add(Box.createHorizontalStrut(380));
        
        lbTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnContenido.add(lbTitulo);
        pnContenido.add(Box.createHorizontalStrut(300));
        
        pnTitulo.add(pnContenido);
        add(pnTitulo, BorderLayout.NORTH);
    }
    
    private void icono(){
        URL url = getClass().getResource("/Recursos/tecNM.png");
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
        setIconImage(img);
    }
    
    private void paneles(){
        PnContenido pnContenido = new PnContenido();
        panelScrol(pnContenido);
        
        PnBotones pnBotones = new PnBotones(pnContenido, this);
        add(pnBotones, BorderLayout.WEST);
    }
    
    private void panelScrol(JPanel pnPanel) {
        JScrollPane spPrincipal = new JScrollPane(pnPanel);
        spPrincipal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(spPrincipal);
    }
    
    public void setTitulo(String titulo){
        lbTitulo.setText(titulo);
    }
    
}
