
package com;

import javax.swing.JOptionPane;


public class VolumenE {

   
    public static void main(String[] args) {
       double radio, volumen;
       radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
       volumen=(4*Math.PI*(Math.pow(radio, 3)/3));
       JOptionPane.showMessageDialog(null, "El volumen es: "+volumen);
    }
    
}
