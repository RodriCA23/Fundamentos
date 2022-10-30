
package com;

import javax.swing.JOptionPane;


public class principal {

  
    public static void main(String[] args) {
        int[] cal= new int [3];
        for(int i=0;i<3;i++){
        cal[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una calificación"));
        }
        double promedio=(cal[0]+cal[1]+cal[2])/3;
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio+"\n"+"De las calificaciónes: "+"\n1.-"+cal[0]+"\n2.-"+cal[1]+"\n3.-"+cal[2]);
    }          
}
