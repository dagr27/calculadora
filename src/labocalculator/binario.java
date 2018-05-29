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
public class binario implements calculator{
    @Override
    public int calcular(int a, int b) {
        return a +b;
    }
    public String calcular(int a){
        String binario="";
        binario = binario  + (a%2);
        a = a/2;
        while(a >= 2){
            binario = binario  + (a%2);
            a = a/2;
        }
        binario = binario + a;
        StringBuilder cadena = new StringBuilder();                
        return cadena.append(binario).reverse().toString();
    }
    
}
