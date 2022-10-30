
package com;

import java.util.Locale;
import javax.swing.JOptionPane;


public class BWP {

  
    public static void main(String[] args) {
       int suma, a, b;
       String repetir = "SI";
       while (repetir.equals("SI") || repetir.equals("S")){
       a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
       b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
       suma=a+b;
       JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
       repetir=JOptionPane.showInputDialog("¿Desea realizar otra suma? (Si/No)");
       repetir=repetir.toUpperCase();
       if (!repetir.equals("SI")||(!repetir.equals("S"))||!repetir.equals("NO")||!repetir.equals("N")){
       JOptionPane.showMessageDialog(null, "Opcion incorrecta");
       }
    }
    }
    
}
