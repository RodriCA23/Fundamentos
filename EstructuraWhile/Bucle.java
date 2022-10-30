
package com;

import javax.swing.JOptionPane;


public class Bucle {

   
    public static void main(String[] args) {
       int num;
       int i=1;
       int suma=0;
       while(i<=10){
       num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
       suma=num+suma;
       i=i+1;
       }
       JOptionPane.showMessageDialog(null, "La suma de los diez numero ingresados es: "+suma);
    }
    
}
