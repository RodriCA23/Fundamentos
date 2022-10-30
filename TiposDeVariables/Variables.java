
package var;

import javax.swing.JOptionPane;

public class Variables {

  
    public static void main(String[] args) {
        String cadena="Rodrigo Carrera";
        int a;
        float b;
        double c;
        char caracter;
        boolean estado;
        int num1=23;
        int num2=7;
        a=num1/num2;
        float n1=23;
        float n2=7; 
        b=n1/n2;
        double deci1=23;
        double deci2=7;
        c=deci1/deci2;
        
        /*JOptionPane.showMessageDialog(null, "El resultado de la división es: "+a);*/
        /*JOptionPane.showMessageDialog(null, "Bienvenido "+cadena+", un saludo");*/
        /*JOptionPane.showMessageDialog(null,"Division int: " +a+"\n"+"Division float: "+b)*/
         JOptionPane.showMessageDialog(null, "El resultado de la division con int es: "+a+
                 "\n"+"El resultado de la division con float es: "+b+
                 "\n"+"El resultado de la division con double es: "+c);
    }
    
}
