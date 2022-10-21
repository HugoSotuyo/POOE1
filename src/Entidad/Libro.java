/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author hdsot
 */
public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPag;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }
    
    
}
