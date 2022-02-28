package proyectolibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author danny
 */
public class ProyectoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Daniel Hernandez Aguirre ICO 2209");
         
         
        System.out.println("PRIMER LIBRO");
        ClaseLibro principito=new ClaseLibro ();
        principito.setTitulo("El principito");
        System.out.println("El titulo es: " + principito.getTitulo());
        principito.setAutor("Saint-Exupery");
        System.out.println ("El autor del libro es: " + principito.getAutor() );
        principito.setEditorial("Emece");
        System.out.println ("La editorial es: " + principito.getEditorial());
        principito.setPaginas(96);
        System.out.println("El numero de paginas es: " + principito.getPaginas());
        principito.setabierto("Si");
        System.out.println("El libro " + principito.getAbierto() + " Esta abierto");
        principito.setocupandose("Si");
        System.out.println("El libro " + principito.getocupandose() + " Se esta ocupando");
        
        
        System.out.println("SEGUNDO LIBRO");
        ClaseLibro rebelion=new ClaseLibro ();
        rebelion.setTitulo("Rebelion en la granja");
        System.out.println("El titulo es: " + rebelion.getTitulo());
        rebelion.setAutor("George Orwell");
        System.out.println ("El autor del libro es: " + rebelion.getAutor() );
        rebelion.setEditorial("ZIG-ZAG");
        System.out.println ("La editorial es: " + rebelion.getEditorial());
        rebelion.setPaginas(110);
        System.out.println("El numero de paginas es: " + rebelion.getPaginas());
        rebelion.setabierto("No");
        System.out.println("El libro " + rebelion.getAbierto() + " Esta abierto");
        rebelion.setocupandose("No");
        System.out.println("El libro " + rebelion.getocupandose() + " Se esta ocupando");
    }
    
}
