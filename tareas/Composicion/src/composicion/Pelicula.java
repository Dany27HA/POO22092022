package composicion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danny
 */
public class Pelicula {
    
    private String Director;
    private String Productora;
    private String Actor;
    private String Viendose;
    private int DuracionMinutos;
    private String Premios;

    public Pelicula() {
    }

    public Pelicula(String Director, String Productora, String Actor, String Viendose, int DuracionMinutos, String Premios) {
        this.Director = Director;
        this.Productora = Productora;
        this.Actor = Actor;
        this.Viendose = Viendose;
        this.DuracionMinutos = DuracionMinutos;
        this.Premios = Premios;
    }

    public String getPremios() {
        return Premios;
    }

    public void setPremios(String Premios) {
        this.Premios = Premios;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String Productora) {
        this.Productora = Productora;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String Actor) {
        this.Actor = Actor;
    }

    public String getViendose() {
        return Viendose;
    }

    public void setViendose(String Viendose) {
        this.Viendose = Viendose;
    }

    public int getDuracionMinutos() {
        return DuracionMinutos;
    }

    public void setDuracionMinutos(int DuracionMinutos) {
        this.DuracionMinutos = DuracionMinutos;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Director=" + Director + ", Productora=" + Productora + ", Actor=" + Actor + ", Viendose=" + Viendose + ", DuracionMinutos=" + DuracionMinutos + ", Premios=" + Premios + '}';
    }
    
    
    
}
