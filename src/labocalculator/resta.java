/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labocalculator;

/**
 *
 * @author Daniel Gómez
 */
public class resta implements calculator{
    @Override
    public int calcular(int a, int b) {
        return a -b;
    }

    @Override
    public String calcular(int a) {
    return "";    
    }
    
}
