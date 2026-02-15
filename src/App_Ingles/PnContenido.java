package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnContenido extends JPanel{
    
    private CardLayout contenido;
    
    public PnContenido(){
        ventanas();
    }
    
    private void ventanas(){
        contenido = new CardLayout();
        setLayout(contenido);
        
        PnInicio pnInicio = new PnInicio();
        add(pnInicio, "INICIO");
        
        PnTeoria pnTeoria = new PnTeoria();
        add(pnTeoria, "TEORIA");
        
        PnFormulario pnFormulario = new PnFormulario();
        add(pnFormulario, "FORMULARIO");
    }
    
    public void conexion(String id){
        contenido.show(this, id);
    }
    
}
