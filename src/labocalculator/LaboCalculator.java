/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labocalculator;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Daniel Gómez
 */
public class LaboCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setVisible(true);
    }
    
}
