/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class Ventana extends JFrame{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    private JButton btn;
    private JButton btn2;
    private JCheckBox check;
    private JTextField text;
    private JComboBox combo;
    
    private static final String ciudad[] = {"Loja", "CUENCA", "ambato"};

    public Ventana() {
        setLayout (new FlowLayout());
        etiqueta1 = new JLabel("Datos generales");
        etiqueta1.setToolTipText("Titulo");
        add(this.etiqueta1);
        Icon icono = new ImageIcon(getClass().getResource("icon.png"));
        etiqueta2 = new JLabel("Etiqueta con icono", icono, SwingConstants.LEFT);
        add(this.etiqueta2);
        etiqueta3 = new JLabel();
        this.etiqueta3.setText("Etiqueta 3");
        Icon icono2 = new ImageIcon(getClass().getResource("cafe.png"));
        this.etiqueta3.setIcon(icono2);
        this.etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        this.etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(this.etiqueta3);
        
        this.texto1 = new JTextField("Ingrese algo", 10);
        add(texto1);
        
        Font tletra = new Font("Serif", Font.BOLD, 18);
        texto2 = new JTextField("Nombre........");
        this.texto2.setFont(tletra);
        add(texto2);
        
        texto3 = new JPasswordField("Password, 10");
        add(texto3);
        
        ManejadorEventos manejador = new ManejadorEventos();
        texto1.addActionListener(manejador);
        this.texto2.addActionListener(manejador);
        this.texto3.addActionListener(manejador);
        
        btn = new JButton("Save your soul");
        add(btn);
        
        this.btn.addActionListener(manejador);
        
        btn2 = new JButton("Show me more");
        btn2.setRolloverIcon(icono2);
        add(btn2);
        
        check = new JCheckBox("descripcion");
        add(this.check);
        
        combo = new JComboBox(ciudad);
        add(this.combo);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            String cadena = "";
            
            if(evento.getSource() == texto1){
                cadena = String.format("Texto 1: %s", evento.getActionCommand());
            }else if(evento.getSource() == texto2){
                cadena = String.format("Texto 2: %s", evento.getActionCommand());
            }else if(evento.getSource() == texto3){
                cadena = String.format("Texto 3: %s", evento.getActionCommand());
            }else if(evento.getSource() == btn){
                cadena = String.format("your soul is safe now bitch");
            }
            JOptionPane.showMessageDialog(null, cadena);
            if (evento.getSource() == check){
                if(check.isSelected()){
                    text.setEditable(true);
                }else{
                    text.setEnabled(false);
                }
            }
        }
    }
    
}
