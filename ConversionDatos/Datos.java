
package Com;

import javax.swing.JOptionPane;


public class Datos {

    public static void main(String[] args) {
        /*int edad;
        String nom;
        int añoNac; 
        nom=JOptionPane.showInputDialog("Ingresa su nombre");
        añoNac=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
        edad=2021-añoNac;
        JOptionPane.showMessageDialog(null, "Hola, "+nom+
                "\n"+"Su edad es: "+edad+" años");*/
        
        double precio;
        double iva;
        double precioVenta;
        String nomProd;
        nomProd=JOptionPane.showInputDialog("Ingresa el nombre del producto");
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto: "));
        iva=0.16*precio;
        precioVenta=precio+iva;
        JOptionPane.showMessageDialog(null, "Producto: "+nomProd+
                "\n"+"precio adquisición: $"+precio+
                "\n"+"Precio venta: $"+precioVenta+"IVA incluido");
    }
    
}
