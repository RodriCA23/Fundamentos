
package com;

import javax.swing.JOptionPane;


public class Dolares {

    
    public static void main(String[] args) {
       double pe, dol;
       dol=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en dolares a convertir"));
       pe= dol * 20.79;
       JOptionPane.showMessageDialog(null, "La cantidad de $ "+dol+" dolares son: $"+pe+" pesos"); 
    }
    
}
