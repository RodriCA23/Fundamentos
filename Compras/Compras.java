
package com;

import javax.swing.JOptionPane;


public class Compras {

   
    public static void main(String[] args) {
       String nom, estable, estable2, estable3;
       double precio, precio2, precio3, media;
       nom=JOptionPane.showInputDialog("Ingresa el nombre del producto");
       precio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
       estable=JOptionPane.showInputDialog("Ingresa el nombre del establecimiento");
       precio2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
       estable2=JOptionPane.showInputDialog("Ingresa el nombre del establecimiento"); 
       precio3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: ")); 
       estable3=JOptionPane.showInputDialog("Ingresa el nombre del establecimiento");
       media=(precio+precio2+precio3)/3;
       JOptionPane.showMessageDialog(null, "Nombre del producto: "+nom+
               "\n"+"Establecimientos donde se compro: "+estable+"\n"+estable2+"\n"+estable3+
               "\n"+"Precios: $"+precio+"\n"+precio2+"\n"+precio3+"\n"+"Precio Medio: "+media);
              
    }
    
}
