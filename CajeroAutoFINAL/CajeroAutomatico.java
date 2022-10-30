
package com;

import javax.swing.JOptionPane;


public class CajeroAutomatico {

    public static void main(String[] args) {
   int option,num, saldo=10000;//caputurar movimiento,Selección de caso 
   String repetir = "SI";//Realizar otro movimiento
   int contraseña=123456;//Contraseña definida
   int incorrecto;//Contador de intentos restantes
   final int intentos=3;//Numero de intentos
   boolean acierto=false;//Estado falso
   int password;//Captura la contraseña por el usuario
   JOptionPane.showMessageDialog(null,"Tarjeta insertada");//Simula tarjeta ingresada
   while (acierto==false){//Ciclo para tiempo de espera
   for(int i=1; i<=intentos && !acierto; i++){//Estructura for 
    password=Integer.parseInt(JOptionPane.showInputDialog("Ingresar NIP"));//Captura contraseña ingresada por el usuario
    if(password==contraseña){//Comparación de contraseñas 
        JOptionPane.showMessageDialog(null, "Bienvenido");//Mensaje de Bienvenida
        while (repetir.equalsIgnoreCase("SI") || repetir.equalsIgnoreCase("S")){//Ciclo while para realizar otro movimiento
        option=Integer.parseInt(JOptionPane.showInputDialog("Ingresar"+"\n"+
            "1.-Consultar saldo"+"\n"+
            "2.-Retirar monto"));
        acierto=true;//Cambia el estado a verdadero al ser la contraseña correcta
    if(option==1){//Primer movimiento mostrar saldo
        JOptionPane.showMessageDialog(null,"Su saldo actual es: $"+saldo);
        repetir=JOptionPane.showInputDialog("¿Desea realizar otra operación? (Si/No)");
        if (repetir.equalsIgnoreCase("SI")||(repetir.equalsIgnoreCase("S"))||repetir.equalsIgnoreCase("NO")||repetir.equalsIgnoreCase("N")){
        JOptionPane.showMessageDialog(null, "Un momento...");//Pantalla de carga
        }
        else {JOptionPane.showMessageDialog(null, "Opcion incorrecta");}//Mensaje al no ingresar una opcion valida
    }
    if(option==2){//Segundo movimiento retirar monto
        num=Integer.parseInt(JOptionPane.showInputDialog("Opciones"+"\n"+//Selección de retiro
             "1.-50"+"\n"+
             "2.-100"+"\n"+
             "3.-200"+"\n"+
             "4.-500"+"\n"+
             "5.-Asignar monto"));
     switch(num){//casos
         case 1:
             saldo=saldo-50;
             JOptionPane.showMessageDialog(null,"Retiro de efectivo $50"+"\n"+
                     "Su saldo actual es: $"+saldo);
             break;
         case 2:
             saldo=saldo-100;
             JOptionPane.showMessageDialog(null,"Retiro de efectivo $100"+"\n"+
                     "Su saldo actual es: $"+saldo);
             break;
         case 3:
             saldo=saldo-200;
             JOptionPane.showMessageDialog(null,"Retiro de efectivo $200"+"\n"+
                     "Su saldo actual es: $"+saldo);
             break; 
         case 4:
             saldo=saldo-500;
             JOptionPane.showMessageDialog(null,"Retiro de efectivo $500"+"\n"+
                     "Su saldo actual es: $"+saldo);
             break;
          case 5:
             int num2;
             num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar monto"));//cantidad designada por el usuario
             if(num2>saldo)//Compara monto a retirar con saldo actual
             {
             JOptionPane.showMessageDialog(null, "Saldo insuficiente");//Si cantidad ingresada es mayor que el saldo disponible
             }
             else{
              saldo=saldo-num2;
             
             JOptionPane.showMessageDialog(null,"Retiro de efectivo: $"+num2+"\n"+//Muestra el saldo retirado y el restante
                     "Su saldo actual es: $"+saldo);}
                       
             break;  
             }
                   break; }//Pertenece al while de espera 
    
                    
        }
        
                                                                                }
    else{
    incorrecto=intentos-i;//Resta intentos si el nip es incorrecto
    JOptionPane.showMessageDialog(null, "NIP incorrecto"+"\n"+"Intentos restantes= "+incorrecto);
            if (incorrecto==0){//Si acaban los intentos, muestra mensaje para volver a intentar ingresar
            JOptionPane.showMessageDialog(null, "Demasiados intentos\n Vuelve a intentarlo en 5:00 minutos ");
            int z=4;//contador de minutos
            while (z>=0){//condicional si los minutos se acaban se termina el ciclo y puede volver a intentar
            for (int segundos = 59; segundos>=0; segundos--) {//Estructura for 
            try {
            Thread.sleep (1000);//Interrumpir el tiempo de impresión entre los segundos
            } 
            catch (InterruptedException e){//Interrumpe el subproceso de conteo
            e.printStackTrace();
            }
            System.out.println (+z+":"+segundos);//Imprime por consola el contador
            }
            z--;//
            }
        }
        }
   }/*termina for*/            
   }/*termina while*/
   } 
    
}
