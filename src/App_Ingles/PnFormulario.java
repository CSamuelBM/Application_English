package App_Ingles;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class PnFormulario extends JPanel{
    
    public PnFormulario(){
        setLayout(new GridBagLayout());
        
        contenido();
    }
    
    private void contenido() {
        GridBagConstraints gbc = new GridBagConstraints();
        
        fila0123(gbc);
    }
    
    private void fila0123(GridBagConstraints gbc) {
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(0, 0, 10, 0);
        JPanel pnPregunta1 = new JPanel();
        pnPregunta1.setBackground(new Color(230, 223, 223));
        pnPregunta1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta1 = new JLabel("Como se escribe la letra A a", SwingConstants.CENTER);
        lbPregunta1.setForeground(Color.BLACK);
        pnPregunta1.add(lbPregunta1);
        JTextField tfPregunta1 = new JTextField(20);
        tfPregunta1.setForeground(Color.BLACK);
        tfPregunta1.setOpaque(false);
        pnPregunta1.add(tfPregunta1);
        add(pnPregunta1, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta2 = new JPanel();
        pnPregunta2.setBackground(new Color(230, 223, 223));
        pnPregunta2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta2 = new JLabel("Como se escribe la letra B b", SwingConstants.CENTER);
        lbPregunta2.setForeground(Color.BLACK);
        pnPregunta2.add(lbPregunta2);
        JTextField tfPregunta2 = new JTextField(20);
        tfPregunta2.setForeground(Color.BLACK);
        tfPregunta2.setOpaque(false);
        pnPregunta2.add(tfPregunta2);
        add(pnPregunta2, gbc);
    }
    
    @Override
    public void paintComponent(Graphics g){
        URL url = getClass().getResource("/Recursos/imgF1.jpg");
        ImageIcon icono = new ImageIcon(url);
        Image img = icono.getImage();
        super.paintComponent(g);
        if(img != null)
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
}
