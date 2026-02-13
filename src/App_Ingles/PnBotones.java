package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnBotones extends JPanel{
    
    private JButton btInicio, btTeoria, btFormulario, btSalir;
    private PnContenido pnContenido;
    
    public PnBotones(){
        botones();
        acciones();
    }
    
    private void botones() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        setBackground(new Color(117, 173, 255));
        
        btInicio = new JButton();
        btInicio.setText("INICIO");
        btInicio.setForeground(Color.BLACK);
        btInicio.setBackground(new Color(255, 255, 255));
        btInicio.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btInicio.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btInicio);
        add(Box.createVerticalStrut(20));
        
        btTeoria = new JButton();
        btTeoria.setText("TEORIA");
        btTeoria.setForeground(Color.BLACK);
        btTeoria.setBackground(new Color(255, 255, 255));
        btTeoria.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btTeoria.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btTeoria);
        add(Box.createVerticalStrut(20));
        
        btFormulario = new JButton();
        btFormulario.setText("FORMULARIO");
        btFormulario.setForeground(Color.BLACK);
        btFormulario.setBackground(new Color(255, 255, 255));
        btFormulario.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btFormulario.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btFormulario);
        add(Box.createVerticalStrut(20));
        
        btSalir = new JButton();
        btSalir.setText("SALIR");
        btSalir.setForeground(Color.BLACK);
        btSalir.setBackground(new Color(255, 255, 255));
        btSalir.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btSalir.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btSalir);
        add(Box.createVerticalStrut(10));
    }

    private void acciones() {
        pnContenido = new PnContenido();
        
        btInicio.addActionListener(e -> {
            pnContenido.concexion("INICIO");
        } );
        
        
    }
    
}
