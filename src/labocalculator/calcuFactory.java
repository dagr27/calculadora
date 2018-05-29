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
public class calcuFactory {
    public static calculator getCalculator(int op){
        switch(op){
            case 1:
                return new suma();
            case 2:
                return new resta();
            case 3: 
                return new multi();
            case 4:
                return new div();
            case 5:
                return new binario();
        }
        return null;
    }
}
