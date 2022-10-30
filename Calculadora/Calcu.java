
package com;

import javax.swing.JOptionPane;


public class Calcu {

    
    public static void main(String[] args) {
        int numero;
        String repetir = "SI";
        while (repetir.equals("SI") || repetir.equals("S")){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la operación deseada"+
                "\n"+"1.- Suma"+"\n"+"2.- Resta"+"\n"+"3.- Multiplicación"+"\n"+"4.- División"));
        switch (numero){
            case 1:
                int a, b, sum;
                a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er numero:"));
                b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do numero:"));
                sum=a+b;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+sum);
                repetir=JOptionPane.showInputDialog("¿Desea realizar otra suma? (Si/No)");
                repetir=repetir.toUpperCase();
                if (repetir.equalsIgnoreCase("SI")||(repetir.equalsIgnoreCase("S"))||repetir.equalsIgnoreCase("NO")||repetir.equalsIgnoreCase("N")){
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                break;
            case 2:
                int c, d, rest;
                c=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er numero:"));
                d=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do numero:"));
                rest=c-d;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+rest);
                repetir=JOptionPane.showInputDialog("¿Desea realizar otra resta? (Si/No)");
                repetir=repetir.toUpperCase();
                if (!repetir.equals("SI")||(!repetir.equals("S"))||!repetir.equals("NO")||!repetir.equals("N")){
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                break;
            case  3:
                int e, f, mult;
                e=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er numero:"));
                f=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do numero:"));
                mult=e*f;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+mult);
                repetir=JOptionPane.showInputDialog("¿Desea realizar otra multiplicación? (Si/No)");
                repetir=repetir.toUpperCase();
                if (!repetir.equals("SI")||(!repetir.equals("S"))||!repetir.equals("NO")||!repetir.equals("N")){
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                break;
            case 4:
                double g, h, div;
                g=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er numero:"));
                h=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do numero:"));
                div=g/h;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+div);
                repetir=JOptionPane.showInputDialog("¿Desea realizar otra división? (Si/No)");
                repetir=repetir.toUpperCase();
                if (!repetir.equals("SI")||(!repetir.equals("S"))||!repetir.equals("NO")||!repetir.equals("N")){
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
                break;   
        }
        }
    }
    
}
