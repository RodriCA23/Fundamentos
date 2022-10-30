
package com;

import javax.swing.JOptionPane;


public class Esta {

    
    public static void main(String[] args) {
       try{
       int z;
       float horas, pre2, costo, dinero, devo;
       z = Integer.parseInt(JOptionPane.showInputDialog("Ingresa"+"\n"+"1.-Para vehiculo"+"\n"+"2.-Para motocicleta"));
       if(z>2 || z<1){
        JOptionPane.showMessageDialog(null, "Ingresar 1 o 2");
       }
       if (z==1){ 
       horas=Float.parseFloat(JOptionPane.showInputDialog("Ingresa las horas"));
       pre2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa los minutos"));
           if (pre2>0){
           horas=horas+1;
           costo=horas*10;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo);
           dinero=Float.parseFloat(JOptionPane.showInputDialog("Ingresa dinero: $"));
           devo=dinero-costo;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo+"\n"+"Pago con: $"+dinero+"\n"+"Cambio: $"+devo);
           }
           else{
           costo= horas*10;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo);
           dinero=Float.parseFloat(JOptionPane.showInputDialog("Ingresa dinero: $"));
           devo=dinero-costo;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo+"\n"+"Pago con: $"+dinero+"\n"+"Cambio: $"+devo);
           }
       }

       else{
       if (z==2){ 
       horas=Float.parseFloat(JOptionPane.showInputDialog("Ingresa las horas"));
       pre2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa los minutos"));
           if (pre2>0){
           horas=horas+1;
           costo=horas*7;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo);
           dinero=Float.parseFloat(JOptionPane.showInputDialog("Ingresa dinero: $"));
           devo=dinero-costo;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo+"\n"+"Pago con: $"+dinero+"\n"+"Cambio: $"+devo);
           }
           else{
           costo= horas*7;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo);
           dinero=Float.parseFloat(JOptionPane.showInputDialog("Ingresa dinero: $"));
           devo=dinero-costo;
           JOptionPane.showMessageDialog(null, "Total a pagar: $"+costo+"\n"+"Pago con: $"+dinero+"\n"+"Cambio: $"+devo);
           }
       }
       
       }
       }
     catch (Exception a){JOptionPane.showMessageDialog(null, "Ingresa 1 o 2 "+a.getMessage());}
    }          
}
