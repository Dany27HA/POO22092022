/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author danny
 */
public class Alumno {
    private String numeroCuneta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuneta, int semestre, float promedio) {
        this.numeroCuneta = numeroCuneta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuneta() {
        return numeroCuneta;
    }

    public void setNumeroCuneta(String numeroCuneta) {
        this.numeroCuneta = numeroCuneta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuneta=" + numeroCuneta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar (int minutos){
        System.out.println("Estudiando..."+ minutos + " minutos");
    }
    public String evaluarDesempenio(){
        return this.promedio > 8.0f?"Sobresaa}liente":"Regular";
    }
}
