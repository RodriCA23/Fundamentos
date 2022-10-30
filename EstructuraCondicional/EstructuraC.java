
package com;

import javax.swing.JOptionPane;


public class EstructuraC {

   
    public static void main(String[] args) {
        /*programa que determina si un numero es par o impar
        int numero, resultado;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        resultado=numero%2;
        if (resultado==0)
        {
        JOptionPane.showMessageDialog(null, "El numero es par");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "El numero es impar");
        }*/
        int a, b, c;
        JOptionPane.showMessageDialog(null, "Ingresa tres valores papra determinar quien es el mayor");
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor"));
        
        if (a>b && a>c){
        JOptionPane.showMessageDialog(null, "El primer valor es mayor: "+a);
        }
        else{
            if (b>a && b>c){
            JOptionPane.showMessageDialog(null, "El segundo valor es mayor: "+b);
        }
            else{
                    JOptionPane.showMessageDialog(null, "El tercer valor es el mayor: "+c);
                    }
                }
        //programa que solicite tres numero, si el primero es negativo los tres se suman
        //caso contrario que el primero sea positivo se multipliquen los tres
        int num1, num2, num3, sum, multi;
        JOptionPane.showMessageDialog(null, "Ingrese tres numeros");
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        if (num1<0){
            sum=num1+num2+num3;
            JOptionPane.showMessageDialog(null, "Se realizo una suma con los tres numero y el resultado es: "+sum);
        }
            else{
            multi=num1*num2*num3;
            JOptionPane.showMessageDialog(null, "se realizo una multiplicacion con los tres numero y el resultado es: "+multi);
                   }
        
        
    }
    
}
