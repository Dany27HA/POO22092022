/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;

/**
 *
 * @author felipezarate
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String nombre = new String("José José");
        System.out.println(nombre); 
        System.out.println( nombre.charAt(5) ); //Caracter de una pocicion concreta
        System.out.println(nombre.toUpperCase()); //Mayuscua

        JFrame ventana = new JFrame("Mi primer ventana JAVA");
        ventana.setSize(600, 400);
        ventana.setVisible(true);*/
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        
        //Ejercicio: Establecer una mouse marca Longited tipo optico
        
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        //Clase
        Computadora compu2 = new Computadora("Apple","MacBook Pro", new Monitor("Toshiba", 14.3f),new Mouse("Actec", "Optico"), new Teclado("Apple", 101), new Procesador("Mi", 3.4f));
        System.out.println(compu2);
        
        /*Computadora compu3 = new Computadora("Apple","MacBook Pro", new Monitor("Toshiba", 14.3f),new Mouse("Mofi", "Inalambrico"), new Teclado("Apple", 101), new Procesador("Mi", 3.4f));
        System.out.println(compu3);*/
        
        //Ejercicio clase //Leer de la 43 a la 53
        compu2.setRaton(new Mouse("apple", "Tocuh"));
        
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);
        
        System.out.println("|||||||||||||||||||||||||||||||");
        
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("123456", "ICO", "Jose Perez", 20);
        System.out.println(alu2);
        
        //Proyecto
       /* Clase libro: autor, editorial
        Clase Pelicula: director, productora, autor principal*/
        
        System.out.println("-------------Composición y herencia en la misma clase------");
       
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetaRed(2);
        System.out.println(server);
        //Para cambiar solo un atributo
        server.setMarca("HP");
        System.out.println(server);
        //Para cambiar los dos atributos desde las subclases
        server.setRaton(new Mouse("Lg", "óptico"));
        System.out.println(server);
        //Para cambiar marca sin modificar el tipo de las subclases
        server.getRaton().setMarca("Longitech");
        
        
        System.out.println("------Ejemplo polimorfismo------");
        
        Perro dog = new Perro("Bull Dog", "5 estrellas", 4);
        dog.emitirSonido();
        Animal animal = dog;
        System.out.println(animal.getClass());
        
    }
    
}