/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author danny
 */
public class Alumno extends Persona{  // Hereda atributos y metodos 

    private String numeroCuenta;
    private String carrera;
    private String grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera, String grupo) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
 
    
}
