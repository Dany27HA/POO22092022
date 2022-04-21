/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author felipezarate
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad = 20;
        System.out.println("Edad = "+ edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(",-,-,-,-,-,-,-,-,");
        /*Convertir String a entero*/
        String cadena = "99";
        int altura = Integer.parseInt(cadena); // Método miembro metodo de clase.
        Color c1 = Color.BLUE; //Atributo miembro o atributo de clase
        altura+= 1;
        System.out.println("Altura = " + altura);
        
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = "+ y);
        System.out.println("----------------------------");
        
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = "+ Arbol.tronco);
        Arbol.generarOxigeno();
        
        
        //Concepto de metodo y atributo de clase: atributo miembros o clases miembros.
        
        
       
        //Codigo sin operador terniario
       int edad3=20;
       //Validar si es mayor de edad
       String resultado = "";
       if(edad3 < 18){
        resultado= "Menor de edad";
       } else {
           resultado = "Mayor de edad, ten un tequila para la garganta";
       }
       
        System.out.println(resultado);
        //Codigo con operador ternario
         //<cond>? <True> : <False>;
         int edad4=24;
         String res="";
         res= edad4<18? "Menor de edad 4" : "Mayor de edad, tequila";
         System.out.println(res);
         
         //Version minima
         int edad5=18;
         System.out.println( edad5<18? "Menor de edad 5" : "Ya el tequila");
         
         //comparacion Or nivel bits
         //val1=000...0001;
         //val2=000...0010;
         /*
         1 or 1 = 1
         1 or 0 = 1
         0 or 0 = 0
         POr otro lado and
         1 and 0 = 0
         1 and 1 = 1
         0 and 1 = 0
         */
         int val1=1;
         int val2=2;
        System.out.println(val1 & val2);
        /*
        Que esta pasando, esto:
        val1=000...0001;
        or
        val2=000...0010;
        ----------------
             000...0011=> 3
        */
        int val3 = 1; //000...0001
        //int val4 <<= val3;
        //int val4 << val3;    
        //System.out.println(val3<<= );
        int val4=0;
        
        val4= val3 <<1;
        // numero de desplazamientos a la izquierda
        System.out.println(val4);
        
        System.out.println("-----ARREGLOS-----");
        int[]edades; //primero se declara un arreglo
        // es este punto aun no se reserva memoria
        // el segundo paso es reservarlo de un
        edades = new int [5];
        System.out.println(edades);
        // ahora la usamos como siempre lo han hecho
        edades [0]=10;
        System.out.println("La primer edad es:"+ edades[0]);
        // declarar e inicializar en una sola linea
        int [] estaturas = new int [5];
        // ahora al igual que en c y c++, puedes asignar valores
        int [] pesos = {86,99,56,76,77}; // en kilos
        // ok, este ultimo veremos su contenido
        System.out.println(pesos[0]); //86
        System.out.println(pesos[1]);//99
        System.out.println(pesos[2]);//56
        System.out.println(pesos[3]);//76
        System.out.println(pesos[4]);//77
        // Imprimir lo mismo con menos lineas de codigo
        System.out.println("-----CON FOR-----");
        for (int i=0; i < pesos.length; i++){
            System.out.println(pesos[i]);
        }
        System.out.println("-----CON FOR IMPRIMIENDO AL REVES-----");
        for (int i=4; i != -1;i--){
            System.out.println(pesos[i]);
            /*OTRA FORMA DE UN COMPAÑERO Y LA CORRECTA AL PARECER AUNQUE LA MIA TAMBIEN FUNCIONO
            for(int i=pesos.length-1;i>=0; i--){
            System.out.println(pesos[i]); */
            System.out.println("Arreglo de alumnos");
            Alumno[]lista = new Alumno[5];// 5 alumnos
            lista[0]=new Alumno("9999",2,9.0f);
            lista[1]=new Alumno("7777",2,7.0f);
            lista[2]=new Alumno("5555",2,7.0f);
            lista[3]=new Alumno("8888",2,8.0f);
            lista[4]=new Alumno("6666",2,6.0f);
            
             for (Alumno alumno : lista) {
                 System.out.println(alumno.evaluarDesempenio());
             }
            //For each es un FOR especial introduciod
            //en la version 2 de java, esa version fue la que sufrio cambios
            //muy grandes EL FOR EACH fue introduciodp para simplificar lso FOR
            //con arreglos.
            System.out.println("Con for each....");
            for(Alumno alumno: lista){
                System.out.println(alumno.evaluarDesempenio());
            }
        }
    }
}

    

//Un atributo de clase o metodo de clase(elementos miembros) son identificadores que almacenan un valor constante o un comportamiento constante igual para todo los objetos de la misma.
//Al ser contante no es necesario crear una instancia(objeto), para acceder a ellos
