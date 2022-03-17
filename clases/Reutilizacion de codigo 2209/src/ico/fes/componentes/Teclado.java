/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author danny
 */
public class Teclado {
    private String Marca;
    private int numeroTeclas;

    public Teclado() {
    }

    public Teclado(String Marca, int numeroTeclas) {
        this.Marca = Marca;
        this.numeroTeclas = numeroTeclas;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "Marca=" + Marca + ", numeroTeclas=" + numeroTeclas + '}';
    }
 
}
