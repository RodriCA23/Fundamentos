
package com;

import javax.swing.JOptionPane;


public class DoWhile {

    
    public static void main(String[] args) {
        int n=0, suma=0, i=0;
        do{
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        suma=suma+n;
        i=i+1;
        }
        while (i<10);
        JOptionPane.showMessageDialog(null, "La suma de los diez numeros ingresados es:"+suma);
        
    }
    
}
