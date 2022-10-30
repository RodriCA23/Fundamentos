
package com;

import javax.swing.JOptionPane;


public class Selec {

    public static void main(String[] args) {
        /*int i=1, contador;
        contador = Integer.parseInt(JOptionPane.showInputDialog("¿Hasta que numero quieres que cuente?"));
        while (i <= contador){
        System.out.println(i);
        i++;
        } */
        /*int i=0;
        System.out.println("Lista 3 en 3 hasta el 50");
        while (i<=50){
        System.out.println(i);
        i+=10;
        }*/
        /*int incremento, contador, i=0;
        incremento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para incrementarlo"));
        contador = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el limite?"));
        System.out.println("Listado "+incremento+" en "+incremento+" hasta el "+contador);
        while (i<=contador){
        System.out.println(i);
        i+=incremento;    
        }*/
        int num, num2, i=0, z=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a multiplicar"));
        System.out.println("Tabla de multiplicar del numero "+num);
        num2=num*10;
        while (i<=num2){
        System.out.println(+num+" X "+z+ " = " +i);
        z++;
        i+=num;
        }
    }
    
}
