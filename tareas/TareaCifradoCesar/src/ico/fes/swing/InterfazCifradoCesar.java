/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author danny
 */
public class InterfazCifradoCesar extends JFrame implements ActionListener{
 
  
    String caracteres = "abcdefghijklmnñopqrstuvwxyz";
    
        private JTextField desplazar;     
    private JTextField mensaje;       
    private JTextField mensaje2;      
    
    private JLabel tipoDesplazamiento;           
    private JLabel colocarTexto;        
    private JLabel mensajeCifrado;         

    private JButton boton;               

    
    public InterfazCifradoCesar() throws HeadlessException {
        setTitle("Cifrado César");
        setSize(727, 527);
        setLayout(null);

        tipoDesplazamiento = new JLabel("Tipo de desplazamiento:");
        tipoDesplazamiento.setBounds(275, 20, 400, 50);

        desplazar = new JTextField();
        desplazar.setBounds(314, 55, 35, 25);
        desplazar.setToolTipText("Introduce el número de desplazamiento deseado");  
      
        colocarTexto = new JLabel("Ingresa un mensaje: ");
        colocarTexto.setBounds(25, 77, 400, 50);
       
        mensaje = new JTextField();
        mensaje.setBounds(25, 110, 250, 250);
        mensaje.setToolTipText("Por favor de introducir el texto a cifrar");     
        
        mensajeCifrado = new JLabel("Mensaje cifrado: ");
        mensajeCifrado.setBounds(400, 1, 200, 200);
   
        mensaje2 = new JTextField();
        mensaje2.setBounds(400, 110, 250, 250);
        mensaje2.setToolTipText("Este es su cifrado");
     
        boton = new JButton("CIFRAR");
        boton.setBounds(300, 375, 77, 27);
        boton.setToolTipText("Por favor de hacer clic para cifrar el mensaje");
   
        this.getContentPane().add(desplazar);
        this.getContentPane().add(mensaje2);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(tipoDesplazamiento);
        this.getContentPane().add(colocarTexto);
        this.getContentPane().add(mensajeCifrado);
        this.getContentPane().add(boton);
        boton.addActionListener(this);

        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == boton) {

            char caracter;
            String texto;
            String textoCodificado = "";

            try { 
                texto = mensaje.getText();
                texto = texto.toLowerCase();               
                int clave = Integer.parseInt(desplazar.getText());
                for (int i = 0; i < texto.length(); i++) {                   
                    caracter = texto.charAt(i);                   
                   int posicion = caracteres.indexOf(caracter);
                    if (posicion == -1) {
                        textoCodificado += caracter;
                    } else {
                        textoCodificado += caracteres.charAt((posicion + clave) % caracteres.length());
                    }
                }
                mensaje2.setText("" + textoCodificado);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(null,
                        "Error al capturar el número, captura un número valido",
                        "Solo introduce valores validos del alfabeto",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
