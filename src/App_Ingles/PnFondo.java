package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnFondo extends JPanel{
    
    private Image img;
    
    public PnFondo(Image img){
        this.img = img;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(img != null)
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
}
