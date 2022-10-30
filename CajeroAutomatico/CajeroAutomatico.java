
package com;

import javax.swing.JOptionPane;


public class CajeroAutomatico {

    public static void main(String[] args) {
   int nip, option,num, saldo=10000;
   String repetir = "SI";
   JOptionPane.showMessageDialog(null,"Tarjeta insertada");  
    nip=Integer.parseInt(JOptionPane.showInputDialog("Ingresar NIP"));
    if(nip==123456){
        JOptionPane.showMessageDialog(null, "Bienvenido");
        while (repetir.equalsIgnoreCase("SI") || repetir.equalsIgnoreCase("S")){
        option=Integer.parseInt(JOptionPane.showInputDialog("Ingresar"+"\n"+
            "1.-Consultar saldo"+"\n"+
            "2.-Retirar monto"));
    if(option==1){
        JOptionPane.showMessageDialog(null,"Su saldo actual es: $"+saldo);
        repetir=JOptionPane.showInputDialog("¿Desea realizar otra operación? (Si/No)");
        if (repetir.equalsIgnoreCase("SI")||(repetir.equalsIgnoreCase("S"))||repetir.equalsIgnoreCase("NO")||repetir.equalsIgnoreCase("N")){
        JOptionPane.showMessageDialog(null, "Un momento...");
        }
        else {JOptionPane.showMessageDialog(null, "Opcion incorrecta");}
    }
    if(option==2){
        num=Integer.parseInt(JOptionPane.showInputDialog("Opciones"+"\n"+
             "1.-50"+"\n"+
             "2.-100"+"\n"+
             "3.-200"+"\n"+
             "4.-500"+"\n"+
             "5.-Asignar monto"));
     switch(num){
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
             num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar monto"));
             if(num2>saldo)
             {
             JOptionPane.showMessageDialog(null, "Saldo insuficiente");
             }
             else{
              saldo=saldo-num2;
             
             JOptionPane.showMessageDialog(null,"Retiro de efectivo: $"+num2+"\n"+
                     "Su saldo actual es: $"+saldo);}
                       
             break;  
             }
                   break; }
    
                    
        }
        
                                                                                }
    else{
    JOptionPane.showMessageDialog(null, "NIP incorrecto, volver a intentar");
        }
                    } 
    
}
