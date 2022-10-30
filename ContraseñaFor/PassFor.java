
package com;

import javax.swing.JOptionPane;


public class PassFor {

   
    public static void main(String[] args) {
  
        String contraseña="gato";
        int incorrecto;
        final int intentos=3;
        boolean acierto=false;
        String password;
        for (int i=1; i<=intentos && !acierto;i++){
        password=JOptionPane.showInputDialog("Introduce la contraseña");
        if(password.equals(contraseña)){
        JOptionPane.showMessageDialog(null, "Contraseña Correcta");
        acierto=true;
        }
        else {
        incorrecto=intentos-i;
        JOptionPane.showMessageDialog(null, "Contraseña incorrecta"+"\n"+"Intentos restantes= "+incorrecto);
            if (incorrecto==0){
            JOptionPane.showMessageDialog(null, "Demasiados intentos, intentos, intentelo mas tarde");
            for (int segundos = 10; segundos>=0; segundos--) {
            try {
            Thread.sleep (1000);
            } 
            catch (InterruptedException e) {
            e.printStackTrace();
            }
            System.out.println (segundos);
            }
            }
        }
        }
        
        
    }
    
}
