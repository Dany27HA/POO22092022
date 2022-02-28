package proyectolibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author danny
 */
public class ClaseLibro {
 private String Titulo;
 private String Autor;
 private String Editorial;
 private int paginas;
 private String abierto;
 private String ocupandose;

    public ClaseLibro(String Titulo, String Autor, String Editorial, int paginas, String abierto, String ocupandose) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.paginas = paginas;
        this.abierto = abierto;
        this.abierto = ocupandose;
    }


    public ClaseLibro() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAbierto() {
        return abierto;
    }

    public void setabierto(String abierto) {
        this.abierto = abierto;
    }
        
    public String getocupandose() {
    return ocupandose;
    }

    public void setocupandose(String ocupandose) {
        this.ocupandose = ocupandose;
    }
}
