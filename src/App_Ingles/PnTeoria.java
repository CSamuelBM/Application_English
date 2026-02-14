package App_Ingles;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class PnTeoria extends JPanel{
    
    public PnTeoria(){
        setLayout(new GridBagLayout());
        
        contenido();
    }
    
    private void contenido() {
        GridBagConstraints gbc = new GridBagConstraints();
        
        filaCero(gbc);
    }
    
    private void filaCero(GridBagConstraints gbc){
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraA = new JPanel(new BorderLayout());
        pnLetraA.setBackground(Color.WHITE);
        pnLetraA.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbA = new JLabel("A a", SwingConstants.CENTER);
        lbA.setForeground(Color.BLACK);
        pnLetraA.add(lbA, BorderLayout.NORTH);
        JLabel lbEscribirA = new JLabel("ei", SwingConstants.CENTER);
        lbEscribirA.setForeground(Color.BLACK);
        pnLetraA.add(lbEscribirA, BorderLayout.CENTER);
        JButton btDecirA = new JButton("Pronunciacion");
        btDecirA.setBackground(Color.WHITE);
        btDecirA.setForeground(Color.BLACK);
        pnLetraA.add(btDecirA, BorderLayout.SOUTH);
        add(pnLetraA, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraB = new JPanel(new BorderLayout());
        pnLetraB.setBackground(Color.WHITE);
        pnLetraB.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbB = new JLabel("B b", SwingConstants.CENTER);
        lbB.setForeground(Color.BLACK);
        pnLetraB.add(lbB, BorderLayout.NORTH);
        JLabel lbEscribirB = new JLabel("bi", SwingConstants.CENTER);
        lbEscribirB.setForeground(Color.BLACK);
        pnLetraB.add(lbEscribirB, BorderLayout.CENTER);
        JButton btDecirB = new JButton("Pronunciacion");
        btDecirB.setBackground(Color.WHITE);
        btDecirB.setForeground(Color.BLACK);
        pnLetraB.add(btDecirB, BorderLayout.SOUTH);
        add(pnLetraB, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraC = new JPanel(new BorderLayout());
        pnLetraC.setBackground(Color.WHITE);
        pnLetraC.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbC = new JLabel("C c", SwingConstants.CENTER);
        lbC.setForeground(Color.BLACK);
        pnLetraC.add(lbC, BorderLayout.NORTH);
        JLabel lbEscribirC = new JLabel("si", SwingConstants.CENTER);
        lbEscribirC.setForeground(Color.BLACK);
        pnLetraC.add(lbEscribirC, BorderLayout.CENTER);
        JButton btDecirC = new JButton("Pronunciacion");
        btDecirC.setBackground(Color.WHITE);
        btDecirC.setForeground(Color.BLACK);
        pnLetraC.add(btDecirC, BorderLayout.SOUTH);
        add(pnLetraC, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraD = new JPanel(new BorderLayout());
        pnLetraD.setBackground(Color.WHITE);
        pnLetraD.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbD = new JLabel("D d", SwingConstants.CENTER);
        lbD.setForeground(Color.BLACK);
        pnLetraD.add(lbD, BorderLayout.NORTH);
        JLabel lbEscribirD = new JLabel("di", SwingConstants.CENTER);
        lbEscribirD.setForeground(Color.BLACK);
        pnLetraD.add(lbEscribirD, BorderLayout.CENTER);
        JButton btDecirD = new JButton("Pronunciacion");
        btDecirD.setBackground(Color.WHITE);
        btDecirD.setForeground(Color.BLACK);
        pnLetraD.add(btDecirD, BorderLayout.SOUTH);
        add(pnLetraD, gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraE = new JPanel(new BorderLayout());
        pnLetraE.setBackground(Color.WHITE);
        pnLetraE.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbE = new JLabel("E e", SwingConstants.CENTER);
        lbE.setForeground(Color.BLACK);
        pnLetraE.add(lbE, BorderLayout.NORTH);
        JLabel lbEscribirE = new JLabel("i", SwingConstants.CENTER);
        lbEscribirE.setForeground(Color.BLACK);
        pnLetraE.add(lbEscribirE, BorderLayout.CENTER);
        JButton btDecirE = new JButton("Pronunciacion");
        btDecirE.setBackground(Color.WHITE);
        btDecirE.setForeground(Color.BLACK);
        pnLetraE.add(btDecirE, BorderLayout.SOUTH);
        add(pnLetraE, gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraF = new JPanel(new BorderLayout());
        pnLetraF.setBackground(Color.WHITE);
        pnLetraF.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbF = new JLabel("F f", SwingConstants.CENTER);
        lbF.setForeground(Color.BLACK);
        pnLetraF.add(lbF, BorderLayout.NORTH);
        JLabel lbEscribirF = new JLabel("ef", SwingConstants.CENTER);
        lbEscribirF.setForeground(Color.BLACK);
        pnLetraF.add(lbEscribirF, BorderLayout.CENTER);
        JButton btDecirF = new JButton("Pronunciacion");
        btDecirF.setBackground(Color.WHITE);
        btDecirF.setForeground(Color.BLACK);
        pnLetraF.add(btDecirF, BorderLayout.SOUTH);
        add(pnLetraF, gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel pnLetraG = new JPanel(new BorderLayout());
        pnLetraG.setBackground(Color.WHITE);
        pnLetraG.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbG = new JLabel("G g", SwingConstants.CENTER);
        lbG.setForeground(Color.BLACK);
        pnLetraG.add(lbG, BorderLayout.NORTH);
        JLabel lbEscribirG = new JLabel("gi", SwingConstants.CENTER);
        lbEscribirG.setForeground(Color.BLACK);
        pnLetraG.add(lbEscribirG, BorderLayout.CENTER);
        JButton btDecirG = new JButton("Pronunciacion");
        btDecirG.setBackground(Color.WHITE);
        btDecirG.setForeground(Color.BLACK);
        pnLetraG.add(btDecirG, BorderLayout.SOUTH);
        add(pnLetraG, gbc);
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
