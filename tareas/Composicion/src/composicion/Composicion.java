/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

/**
 *
 * @author danny
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("PRIMER LIBRO");
        Libro principito=new Libro ();
        principito.setTitulo("El principito");
        System.out.println("El titulo es: " + principito.getTitulo());
        principito.setAutor("Saint-Exupery");
        System.out.println ("El autor del libro es: " + principito.getAutor() );
        principito.setEditorial("Emece");
        System.out.println ("La editorial es: " + principito.getEditorial());
        principito.setPaginas(96);
        System.out.println("El numero de paginas es: " + principito.getPaginas());
        principito.setLeyendose("Si");
        System.out.println("El libro " + principito.getLeyendose() + " Se esta ocupando");
        
         System.out.println("-------------------");
         System.out.println("Segundo Libro");
         Libro rebelion=new Libro("Rebelion en la granja", "George Orwell", "ZIG-ZAG", 110, "Si");
         System.out.println( rebelion );
         
           System.out.println("-------------------");
        System.out.println("Primer Pelicula");
        Pelicula KungFuPanada=new Pelicula(" Mark Osborne", "DREAMWORKS", "Jack Black", "Si", 92, "Premios Annie con 16 nominaciones y 10 galardones");
        System.out.println( KungFuPanada );
        
        System.out.println("-------------------");
        System.out.println("Segunda Pelicula");
        Pelicula Titanic=new Pelicula("James Cameron", "20th Century Studios", "Leonardo Dicaprio", "Si", 194, "Once Óscar de catorce nominaciones");
        System.out.println(Titanic);

      
    }
    
}
