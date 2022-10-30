
package com;

import javax.swing.JOptionPane;


public class Par_imp {

   
    public static void main(String[] args) {
      int numero, par=0, i, impar;
      for(i=1; i<=10; i++){
      numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      if(numero%2==0){par=par+1;}
      }
      impar=10-par;
      JOptionPane.showMessageDialog(null, "Se han ingresado "+par+" numeros pares"+
              "\n"+"Se han ingresado "+impar+" numeros impares");
    }
    
}
