/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {
        String isbn;
        String titulo;
        String autor;
        int numPag;
        
        System.out.println("Ingrese ISBN ");
        isbn=leer.nextLine();
        System.out.println("Ingrese Titulo ");
        titulo=leer.nextLine();
        System.out.println("Ingrese Autor ");
        autor=leer.nextLine();
        System.out.println("Ingrese Numero de Paginas ");
        numPag=leer.nextInt();
        
        Libro libroCompleto = new Libro(isbn,titulo,autor,numPag);
        
        return libroCompleto;
    }
    
    public void mostrarLibro(Libro L1){
        System.out.println("ISBN: "+ L1.getISBN()+" TTULO: "+ L1.getTitulo()+
            " AUTOR: "+ L1.getAutor()+" NUMERO DE PAGINAS: "+L1.getNumPag());
        
    }

}
