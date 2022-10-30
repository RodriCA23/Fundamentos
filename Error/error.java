/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.JOptionPane;

public class error {

    
    public static void main(String[] args) {
        try{
        double sueldo;
        double impuesto;
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
        impuesto=0.20*sueldo;
        JOptionPane.showMessageDialog(null, "El impuesto descontado es: $"+impuesto);
        }  
        catch (Exception a){JOptionPane.showMessageDialog(null, "Valores incorrectos"+a.getMessage());}
    }
    
}
