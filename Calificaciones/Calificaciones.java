
package com;

import javax.swing.JOptionPane;


public class Calificaciones {

    public static void main(String[] args) {
        try{
        String nom;
        int cali, cali2, cali3, prom;
        nom=JOptionPane.showInputDialog("Ingresa el nombre del alumno");
        cali=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primera calificaion: "));
        cali2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la segunda calificaion: "));
        cali3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tercera calificaion: "));
        prom=(cali+cali2+cali3)/3;
        if (prom>=70){
        JOptionPane.showMessageDialog(null, "Alumno: "+nom+
                "\n"+"Promedio optenido: "+prom+
                "\n"+"Estado: Aprobado");
        }
        else{
        JOptionPane.showMessageDialog(null, "Alumno: "+nom+
                "\n"+"Promedio optenido: "+prom+
                "\n"+"Estado: Reprobado");
        }
        }
        catch (Exception a){JOptionPane.showMessageDialog(null, "Introducir numero de 0 a 100"+a.getMessage());}
    }
    
}
