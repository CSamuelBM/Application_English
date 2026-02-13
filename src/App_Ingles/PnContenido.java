package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnContenido extends JPanel{
    
    private CardLayout contenido;
    private PnInicio pnInicio;
    
    public PnContenido(){
        ventanas();
    }
    
    private void ventanas(){
        contenido = new CardLayout();
        setLayout(contenido);
        
        pnInicio = new PnInicio();
        
        add(pnInicio, "INICIO");
    }
    
    public void concexion(String id){
        contenido.show(this, id);
    }
    
}
