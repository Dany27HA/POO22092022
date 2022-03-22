package composicion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danny
 */
public class Libro {
  private String Titulo;
  private String Autor;
  private String Editorial;
  private int paginas;
  private String leyendose;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, String Editorial, int paginas, String leyendose) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.paginas = paginas;
        this.leyendose = leyendose;
    }

    public String getLeyendose() {
        return leyendose;
    }

    public void setLeyendose(String leyendose) {
        this.leyendose = leyendose;
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

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Editorial=" + Editorial + ", paginas=" + paginas + ", leyendose=" + leyendose + '}';
    }
  
  
}
