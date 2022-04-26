/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author danny
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Areeglo CuentHabiente");
        Cuentahabiente[]lista = new Cuentahabiente[5];
        lista[0]=new Cuentahabiente("12358", "Alejandro Martinez Villegas", 125000);
        lista[1]=new Cuentahabiente("85321", "Bernarrdo Llano Barrera", 10500);
        lista[2]=new Cuentahabiente("98632", "Javier Lopez Torres", 24000);
        lista[3]=new Cuentahabiente("42579", "Aline Escamilla Betanzos", 200000);
        lista[4]=new Cuentahabiente("27729", "Daniel Hernandez Aguirre", 270916);

        for (Cuentahabiente Cuentahabiente: lista){
                System.out.println(Cuentahabiente.evaluarNivelCliente());
            }
    }

}
