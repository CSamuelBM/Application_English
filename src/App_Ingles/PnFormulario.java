package App_Ingles;

import java.awt.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

public class PnFormulario extends JPanel{
    
    private JTextField tfPregunta1, tfPregunta2, tfPregunta3, tfPregunta4, tfPregunta5;
    private JTextField tfPregunta6, tfPregunta7, tfPregunta8, tfPregunta9, tfPregunta10;
    private JTextField tfPregunta11, tfPregunta12, tfPregunta13, tfPregunta14, tfPregunta15;
    private JTextField tfPregunta16, tfPregunta17, tfPregunta18, tfPregunta19, tfPregunta20;
    private JTextField tfPregunta21, tfPregunta22, tfPregunta23, tfPregunta24, tfPregunta25, tfPregunta26;
    
    private ArrayList<JTextField> listaPreguntas = new ArrayList<>();
    
    private Map<Integer, String> mpRespuestas = new HashMap<>();
    
    private JButton btEnviar;
    
    public PnFormulario(){
        setLayout(new GridBagLayout());
        
        contenido();
    }
    
    private void contenido() {
        GridBagConstraints gbc = new GridBagConstraints();
        
        quintaUno(gbc);
        quintaDos(gbc);
        quintaTres(gbc);
        quintaCuatro(gbc);
        sextaUno(gbc);
        
        iniciarPreguntas();
        respuestas();
        
        botonEnviar(gbc);
    }
    
    private void botonEnviar(GridBagConstraints gbc){
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 15, 10, 15);
        JPanel pnEnviar = new JPanel();
        pnEnviar.setBackground(new Color(230, 223, 223));
        pnEnviar.setOpaque(false);
        pnEnviar.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        btEnviar = new JButton("ENVIAR");
        btEnviar.setForeground(Color.BLACK);
        btEnviar.setBackground(new Color(230, 223, 223));
        btEnviar.setPreferredSize(new Dimension(180, 25));
        btEnviar.addActionListener(e -> resultados());
        pnEnviar.add(btEnviar);
        add(pnEnviar, gbc);
    }
    
    private void resultados(){
        boolean estaVacia = false;
        int aciertos = 0;
        
        for(JTextField tf : listaPreguntas){
            if(tf.getText().trim().isEmpty()){
                estaVacia = true;
                break;
            }
        }
        
        if(!estaVacia){
            for(int i= 0; i< listaPreguntas.size(); i++){
                if(mpRespuestas.get(i).equalsIgnoreCase(listaPreguntas.get(i).getText()))
                    aciertos++;
            }
            JOptionPane.showMessageDialog(null, "Tus aciertos fueron: "+ aciertos);
            for(JTextField tf : listaPreguntas)
                tf.setText("");
        }
        else
            JOptionPane.showMessageDialog(null, "Contesta todas las preguntas");
    }
    
    public void reinicio() {
        for(JTextField tf : listaPreguntas)
                tf.setText("");
    }
    
    private void quintaUno(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 0, 10, 0);
        JPanel pnPregunta1 = new JPanel();
        pnPregunta1.setBackground(new Color(230, 223, 223));
        pnPregunta1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta1 = new JLabel("1) Como se escribe la letra A a", SwingConstants.CENTER);
        lbPregunta1.setForeground(Color.BLACK);
        pnPregunta1.add(lbPregunta1);
        tfPregunta1 = new JTextField(20);
        tfPregunta1.setForeground(Color.BLACK);
        tfPregunta1.setOpaque(false);
        pnPregunta1.add(tfPregunta1);
        add(pnPregunta1, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta2 = new JPanel();
        pnPregunta2.setBackground(new Color(230, 223, 223));
        pnPregunta2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta2 = new JLabel("2) Como se escribe la letra B b", SwingConstants.CENTER);
        lbPregunta2.setForeground(Color.BLACK);
        pnPregunta2.add(lbPregunta2);
        tfPregunta2 = new JTextField(20);
        tfPregunta2.setForeground(Color.BLACK);
        tfPregunta2.setOpaque(false);
        pnPregunta2.add(tfPregunta2);
        add(pnPregunta2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta3 = new JPanel();
        pnPregunta3.setBackground(new Color(230, 223, 223));
        pnPregunta3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta3 = new JLabel("3) Como se escribe la letra C c", SwingConstants.CENTER);
        lbPregunta3.setForeground(Color.BLACK);
        pnPregunta3.add(lbPregunta3);
        tfPregunta3 = new JTextField(20);
        tfPregunta3.setForeground(Color.BLACK);
        tfPregunta3.setOpaque(false);
        pnPregunta3.add(tfPregunta3);
        add(pnPregunta3, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta4 = new JPanel();
        pnPregunta4.setBackground(new Color(230, 223, 223));
        pnPregunta4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta4 = new JLabel("4) Como se escribe la letra D d", SwingConstants.CENTER);
        lbPregunta4.setForeground(Color.BLACK);
        pnPregunta4.add(lbPregunta4);
        tfPregunta4 = new JTextField(20);
        tfPregunta4.setForeground(Color.BLACK);
        tfPregunta4.setOpaque(false);
        pnPregunta4.add(tfPregunta4);
        add(pnPregunta4, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta5 = new JPanel();
        pnPregunta5.setBackground(new Color(230, 223, 223));
        pnPregunta5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta5 = new JLabel("5) Como se escribe la letra E e", SwingConstants.CENTER);
        lbPregunta5.setForeground(Color.BLACK);
        pnPregunta5.add(lbPregunta5);
        tfPregunta5 = new JTextField(20);
        tfPregunta5.setForeground(Color.BLACK);
        tfPregunta5.setOpaque(false);
        pnPregunta5.add(tfPregunta5);
        add(pnPregunta5, gbc);
    }
    
    private void quintaDos(GridBagConstraints gbc){
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta6 = new JPanel();
        pnPregunta6.setBackground(new Color(230, 223, 223));
        pnPregunta6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta6 = new JLabel("6) Como se escribe la letra F f", SwingConstants.CENTER);
        lbPregunta6.setForeground(Color.BLACK);
        pnPregunta6.add(lbPregunta6);
        tfPregunta6 = new JTextField(20);
        tfPregunta6.setForeground(Color.BLACK);
        tfPregunta6.setOpaque(false);
        pnPregunta6.add(tfPregunta6);
        add(pnPregunta6, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta7 = new JPanel();
        pnPregunta7.setBackground(new Color(230, 223, 223));
        pnPregunta7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta7 = new JLabel("7) Como se escribe la letra G g", SwingConstants.CENTER);
        lbPregunta7.setForeground(Color.BLACK);
        pnPregunta7.add(lbPregunta7);
        tfPregunta7 = new JTextField(20);
        tfPregunta7.setForeground(Color.BLACK);
        tfPregunta7.setOpaque(false);
        pnPregunta7.add(tfPregunta7);
        add(pnPregunta7, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta8 = new JPanel();
        pnPregunta8.setBackground(new Color(230, 223, 223));
        pnPregunta8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta8 = new JLabel("8) Como se escribe la letra H h", SwingConstants.CENTER);
        lbPregunta8.setForeground(Color.BLACK);
        pnPregunta8.add(lbPregunta8);
        tfPregunta8 = new JTextField(20);
        tfPregunta8.setForeground(Color.BLACK);
        tfPregunta8.setOpaque(false);
        pnPregunta8.add(tfPregunta8);
        add(pnPregunta8, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta9 = new JPanel();
        pnPregunta9.setBackground(new Color(230, 223, 223));
        pnPregunta9.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta9 = new JLabel("9) Como se escribe la letra I i", SwingConstants.CENTER);
        lbPregunta9.setForeground(Color.BLACK);
        pnPregunta9.add(lbPregunta9);
        tfPregunta9 = new JTextField(20);
        tfPregunta9.setForeground(Color.BLACK);
        tfPregunta9.setOpaque(false);
        pnPregunta9.add(tfPregunta9);
        add(pnPregunta9, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta10 = new JPanel();
        pnPregunta10.setBackground(new Color(230, 223, 223));
        pnPregunta10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta10 = new JLabel("10) Como se escribe la letra J j", SwingConstants.CENTER);
        lbPregunta10.setForeground(Color.BLACK);
        pnPregunta10.add(lbPregunta10);
        tfPregunta10 = new JTextField(20);
        tfPregunta10.setForeground(Color.BLACK);
        tfPregunta10.setOpaque(false);
        pnPregunta10.add(tfPregunta10);
        add(pnPregunta10, gbc);
    }
    
    private void quintaTres(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta11 = new JPanel();
        pnPregunta11.setBackground(new Color(230, 223, 223));
        pnPregunta11.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta11 = new JLabel("11) Como se escribe la letra K k", SwingConstants.CENTER);
        lbPregunta11.setForeground(Color.BLACK);
        pnPregunta11.add(lbPregunta11);
        tfPregunta11 = new JTextField(20);
        tfPregunta11.setForeground(Color.BLACK);
        tfPregunta11.setOpaque(false);
        pnPregunta11.add(tfPregunta11);
        add(pnPregunta11, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta12 = new JPanel();
        pnPregunta12.setBackground(new Color(230, 223, 223));
        pnPregunta12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta12 = new JLabel("12) Como se escribe la letra L l", SwingConstants.CENTER);
        lbPregunta12.setForeground(Color.BLACK);
        pnPregunta12.add(lbPregunta12);
        tfPregunta12 = new JTextField(20);
        tfPregunta12.setForeground(Color.BLACK);
        tfPregunta12.setOpaque(false);
        pnPregunta12.add(tfPregunta12);
        add(pnPregunta12, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta13 = new JPanel();
        pnPregunta13.setBackground(new Color(230, 223, 223));
        pnPregunta13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta13 = new JLabel("13) Como se escribe la letra M m", SwingConstants.CENTER);
        lbPregunta13.setForeground(Color.BLACK);
        pnPregunta13.add(lbPregunta13);
        tfPregunta13 = new JTextField(20);
        tfPregunta13.setForeground(Color.BLACK);
        tfPregunta13.setOpaque(false);
        pnPregunta13.add(tfPregunta13);
        add(pnPregunta13, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta14 = new JPanel();
        pnPregunta14.setBackground(new Color(230, 223, 223));
        pnPregunta14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta14 = new JLabel("14) Como se escribe la letra N n", SwingConstants.CENTER);
        lbPregunta14.setForeground(Color.BLACK);
        pnPregunta14.add(lbPregunta14);
        tfPregunta14 = new JTextField(20);
        tfPregunta14.setForeground(Color.BLACK);
        tfPregunta14.setOpaque(false);
        pnPregunta14.add(tfPregunta14);
        add(pnPregunta14, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta15 = new JPanel();
        pnPregunta15.setBackground(new Color(230, 223, 223));
        pnPregunta15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta15 = new JLabel("15) Como se escribe la letra O o", SwingConstants.CENTER);
        lbPregunta15.setForeground(Color.BLACK);
        pnPregunta15.add(lbPregunta15);
        tfPregunta15 = new JTextField(20);
        tfPregunta15.setForeground(Color.BLACK);
        tfPregunta15.setOpaque(false);
        pnPregunta15.add(tfPregunta15);
        add(pnPregunta15, gbc);
    }
    
    private void quintaCuatro(GridBagConstraints gbc) {
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta16 = new JPanel();
        pnPregunta16.setBackground(new Color(230, 223, 223));
        pnPregunta16.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta16 = new JLabel("16) Como se escribe la letra P p", SwingConstants.CENTER);
        lbPregunta16.setForeground(Color.BLACK);
        pnPregunta16.add(lbPregunta16);
        tfPregunta16 = new JTextField(20);
        tfPregunta16.setForeground(Color.BLACK);
        tfPregunta16.setOpaque(false);
        pnPregunta16.add(tfPregunta16);
        add(pnPregunta16, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta17 = new JPanel();
        pnPregunta17.setBackground(new Color(230, 223, 223));
        pnPregunta17.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta17 = new JLabel("17) Como se escribe la letra Q q", SwingConstants.CENTER);
        lbPregunta17.setForeground(Color.BLACK);
        pnPregunta17.add(lbPregunta17);
        tfPregunta17 = new JTextField(20);
        tfPregunta17.setForeground(Color.BLACK);
        tfPregunta17.setOpaque(false);
        pnPregunta17.add(tfPregunta17);
        add(pnPregunta17, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta18 = new JPanel();
        pnPregunta18.setBackground(new Color(230, 223, 223));
        pnPregunta18.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta18 = new JLabel("18) Como se escribe la letra R r", SwingConstants.CENTER);
        lbPregunta18.setForeground(Color.BLACK);
        pnPregunta18.add(lbPregunta18);
        tfPregunta18 = new JTextField(20);
        tfPregunta18.setForeground(Color.BLACK);
        tfPregunta18.setOpaque(false);
        pnPregunta18.add(tfPregunta18);
        add(pnPregunta18, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta19 = new JPanel();
        pnPregunta19.setBackground(new Color(230, 223, 223));
        pnPregunta19.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta19 = new JLabel("19) Como se escribe la letra S s", SwingConstants.CENTER);
        lbPregunta19.setForeground(Color.BLACK);
        pnPregunta19.add(lbPregunta19);
        tfPregunta19 = new JTextField(20);
        tfPregunta19.setForeground(Color.BLACK);
        tfPregunta19.setOpaque(false);
        pnPregunta19.add(tfPregunta19);
        add(pnPregunta19, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta20 = new JPanel();
        pnPregunta20.setBackground(new Color(230, 223, 223));
        pnPregunta20.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta20 = new JLabel("20) Como se escribe la letra T t", SwingConstants.CENTER);
        lbPregunta20.setForeground(Color.BLACK);
        pnPregunta20.add(lbPregunta20);
        tfPregunta20 = new JTextField(20);
        tfPregunta20.setForeground(Color.BLACK);
        tfPregunta20.setOpaque(false);
        pnPregunta20.add(tfPregunta20);
        add(pnPregunta20, gbc);
    }
    
    private void sextaUno(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta21 = new JPanel();
        pnPregunta21.setBackground(new Color(230, 223, 223));
        pnPregunta21.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta21 = new JLabel("21) Como se escribe la letra U u", SwingConstants.CENTER);
        lbPregunta21.setForeground(Color.BLACK);
        pnPregunta21.add(lbPregunta21);
        tfPregunta21 = new JTextField(20);
        tfPregunta21.setForeground(Color.BLACK);
        tfPregunta21.setOpaque(false);
        pnPregunta21.add(tfPregunta21);
        add(pnPregunta21, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta22 = new JPanel();
        pnPregunta22.setBackground(new Color(230, 223, 223));
        pnPregunta22.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta22 = new JLabel("22) Como se escribe la letra V v", SwingConstants.CENTER);
        lbPregunta22.setForeground(Color.BLACK);
        pnPregunta22.add(lbPregunta22);
        tfPregunta22 = new JTextField(20);
        tfPregunta22.setForeground(Color.BLACK);
        tfPregunta22.setOpaque(false);
        pnPregunta22.add(tfPregunta22);
        add(pnPregunta22, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta23 = new JPanel();
        pnPregunta23.setBackground(new Color(230, 223, 223));
        pnPregunta23.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta23 = new JLabel("23) Como se escribe la letra W w", SwingConstants.CENTER);
        lbPregunta23.setForeground(Color.BLACK);
        pnPregunta23.add(lbPregunta23);
        tfPregunta23 = new JTextField(20);
        tfPregunta23.setForeground(Color.BLACK);
        tfPregunta23.setOpaque(false);
        pnPregunta23.add(tfPregunta23);
        add(pnPregunta23, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta24 = new JPanel();
        pnPregunta24.setBackground(new Color(230, 223, 223));
        pnPregunta24.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta24 = new JLabel("24) Como se escribe la letra X x", SwingConstants.CENTER);
        lbPregunta24.setForeground(Color.BLACK);
        pnPregunta24.add(lbPregunta24);
        tfPregunta24 = new JTextField(20);
        tfPregunta24.setForeground(Color.BLACK);
        tfPregunta24.setOpaque(false);
        pnPregunta24.add(tfPregunta24);
        add(pnPregunta24, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta25 = new JPanel();
        pnPregunta25.setBackground(new Color(230, 223, 223));
        pnPregunta25.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta25 = new JLabel("25) Como se escribe la letra Y y", SwingConstants.CENTER);
        lbPregunta25.setForeground(Color.BLACK);
        pnPregunta25.add(lbPregunta25);
        tfPregunta25 = new JTextField(20);
        tfPregunta25.setForeground(Color.BLACK);
        tfPregunta25.setOpaque(false);
        pnPregunta25.add(tfPregunta25);
        add(pnPregunta25, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        JPanel pnPregunta26 = new JPanel();
        pnPregunta26.setBackground(new Color(230, 223, 223));
        pnPregunta26.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel lbPregunta26 = new JLabel("26) Como se escribe la letra Z z", SwingConstants.CENTER);
        lbPregunta26.setForeground(Color.BLACK);
        pnPregunta26.add(lbPregunta26);
        tfPregunta26 = new JTextField(20);
        tfPregunta26.setForeground(Color.BLACK);
        tfPregunta26.setOpaque(false);
        pnPregunta26.add(tfPregunta26);
        add(pnPregunta26, gbc);
    }
    
    private void respuestas(){
        mpRespuestas.put(0, "ei");
        mpRespuestas.put(1, "bi");
        mpRespuestas.put(2, "si");
        mpRespuestas.put(3, "di");
        mpRespuestas.put(4, "i");
        
        mpRespuestas.put(5, "ef");
        mpRespuestas.put(6, "gi");
        mpRespuestas.put(7, "eich");
        mpRespuestas.put(8, "ai");
        mpRespuestas.put(9, "jei");
        
        mpRespuestas.put(10, "kei");
        mpRespuestas.put(11, "el");
        mpRespuestas.put(12, "em");
        mpRespuestas.put(13, "en");
        mpRespuestas.put(14, "ou");
        
        mpRespuestas.put(15, "pi");
        mpRespuestas.put(16, "kiu");
        mpRespuestas.put(17, "ar");
        mpRespuestas.put(18, "es");
        mpRespuestas.put(19, "ti");
        
        mpRespuestas.put(20, "iu");
        mpRespuestas.put(21, "vi");
        mpRespuestas.put(22, "dabliu");
        mpRespuestas.put(23, "ecs");
        mpRespuestas.put(24, "uai");
        mpRespuestas.put(25, "zed");
    }
    
    private void iniciarPreguntas(){
        listaPreguntas.add(tfPregunta1);
        listaPreguntas.add(tfPregunta2);
        listaPreguntas.add(tfPregunta3);
        listaPreguntas.add(tfPregunta4);
        listaPreguntas.add(tfPregunta5);
        
        listaPreguntas.add(tfPregunta6);
        listaPreguntas.add(tfPregunta7);
        listaPreguntas.add(tfPregunta8);
        listaPreguntas.add(tfPregunta9);
        listaPreguntas.add(tfPregunta10);
        
        listaPreguntas.add(tfPregunta11);
        listaPreguntas.add(tfPregunta12);
        listaPreguntas.add(tfPregunta13);
        listaPreguntas.add(tfPregunta14);
        listaPreguntas.add(tfPregunta15);
        
        listaPreguntas.add(tfPregunta16);
        listaPreguntas.add(tfPregunta17);
        listaPreguntas.add(tfPregunta18);
        listaPreguntas.add(tfPregunta19);
        listaPreguntas.add(tfPregunta20);
        
        listaPreguntas.add(tfPregunta21);
        listaPreguntas.add(tfPregunta22);
        listaPreguntas.add(tfPregunta23);
        listaPreguntas.add(tfPregunta24);
        listaPreguntas.add(tfPregunta25);
        listaPreguntas.add(tfPregunta26);
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
