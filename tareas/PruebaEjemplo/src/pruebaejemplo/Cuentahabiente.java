/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author danny
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private int balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    public void retirarDinero (){
        System.out.println("Retirando 2700 pesos, resta en la cuenta" + (balance-2700) +" pesos" );
    }
     public String evaluarNivelCliente(){
            return this.balance > 50000?nombre+" Es un cliente Premium con un saldo en cuenta de "+balance+" pesos":nombre+" Es un cliente Regular con un saldo en cuenta de "+balance+" pesos";
    }
}
