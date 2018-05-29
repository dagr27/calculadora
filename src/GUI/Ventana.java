/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import labocalculator.*;

/**
 *
 * @author Daniel Gómez
 */
public class Ventana extends JPanel {
    public int WIDTH=300, widthTF=120,widthB=80;
    public int HEIGHT=300, heightTF=30, heightB=30;
    public JTextField n1, n2, total;
    public JButton calcularS,calcularR,calcularD,calcularM,calcularB, habilitar;
    
    public Ventana(){
    n1 = new JTextField();
    n1.setBounds(new Rectangle(30,50,75,30));
    
    n2 = new JTextField();
    n2.setBounds(new Rectangle(110,50,75,30));
    
    total = new JTextField();
    total.setBounds(new Rectangle(70,90,75,30));
    total.setEditable(false);

    calcularS = new JButton("Sumar");
    calcularS.setBounds(new Rectangle(70,125,75,30));
    
    calcularR = new JButton("Restar");
    calcularR.setBounds(new Rectangle(70,160,75,30));
    
    calcularD = new JButton("Dividir");
    calcularD.setBounds(new Rectangle(70,195,75,30));
   
    calcularM = new JButton("Multiplicar");
    calcularM.setBounds(new Rectangle(70,230,75,30));
    
    calcularB = new JButton("Binario");
    calcularB.setBounds(new Rectangle(70,265,75,30));
    
    habilitar = new JButton("Habilitar Caja 2");
    habilitar.setBounds(new Rectangle(190,50,75,30));
    
    calcularS.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String a = n1.getText();
            int x = Integer.parseInt(a);
            String b = n2.getText();
            int y = Integer.parseInt(b);
            calculator calc = calcuFactory.getCalculator(1);
            int t = calc.calcular(x, y);
            String tota = Integer.toString(t);
            total.setText(tota);
            
            
        }
     
    });
    calcularR.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String a = n1.getText();
            int x = Integer.parseInt(a);
            String b = n2.getText();
            int y = Integer.parseInt(b);
            calculator calc = calcuFactory.getCalculator(2);
            int t = calc.calcular(x, y);
            String tota = Integer.toString(t);
            total.setText(tota);
            
            
        }
     
    });
    calcularM.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String a = n1.getText();
            int x = Integer.parseInt(a);
            String b = n2.getText();
            int y = Integer.parseInt(b);
            calculator calc = calcuFactory.getCalculator(3);
            int t = calc.calcular(x, y);
            String tota = Integer.toString(t);
            total.setText(tota);
            
            
        }
     
    });
    calcularD.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String a = n1.getText();
            int x = Integer.parseInt(a);
            String b = n2.getText();
            int y = Integer.parseInt(b);
            calculator calc = calcuFactory.getCalculator(4);
            int t = calc.calcular(x, y);
            String tota = Integer.toString(t);
            total.setText(tota);
            
            
        }
     
    });
    calcularB.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            n2.setEditable(false);
            n2.setText("Convertir base 2");
            String a = n1.getText();
            int x = Integer.parseInt(a);
            calculator calc = calcuFactory.getCalculator(5);
            String t = calc.calcular(x);
            total.setText(t);
            
            
        }
     
    });
    habilitar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0) {
            n2.setEditable(true);
            n2.setText("");          
        }
     
    });
    
    
    
    add(n1);
    add(n2);
    add(total);
    add(habilitar);
    add(calcularS);
    add(calcularR);
    add(calcularM);
    add(calcularD);
    add(calcularB);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    
    }   
}

