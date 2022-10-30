
package com;

import javax.swing.JOptionPane;


public class Acertijo {

    
    public static void main(String[] args) {
      String contraseña="ElCerebro";
        int incorrecto;
        final int intentos=3;
        boolean acierto=false;
        String password;
        while(acierto==false){
        for (int i=1; i<=intentos && !acierto;i++){
        JOptionPane.showMessageDialog(null, "¿Qué da órdenes y las recibe, autoriza algunas y prohíbe otras?");
        password=JOptionPane.showInputDialog("Introduce tu respuesta:");
        if(password.equalsIgnoreCase(contraseña)){
        JOptionPane.showMessageDialog(null, "Felicidades");
        acierto=true;
        }
        else {
        incorrecto=intentos-i;
        JOptionPane.showMessageDialog(null, "Respuesta incorrecta"+"\n"+"Intentos restantes= "+incorrecto);
            if (incorrecto==0){
            JOptionPane.showMessageDialog(null, "Suerte para la próxima\n Vuelve a intentarlo en 5:00 minutos ");
            int z=5;
            while (z>=0){
            for (int segundos = 59; segundos>=0; segundos--) {
            try {
            Thread.sleep (1000);
            } 
            catch (InterruptedException e) {
            e.printStackTrace();
            }
            System.out.println (+z+":"+segundos);
            }
            z--;
            }
        }/*termina el if */
        }/*termina else*/
        }/*termina el for*/
        } /*aqui termina el while*/
    }
}














































