package com.fhviteri.pooimprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements IImprimible{

    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public  Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
    StringBuilder sb = new StringBuilder();
    sb.append("Titulo: ").append(this.titulo)
            .append("Autor: ").append(this.autor).append("\n")
            .append("Genero: ").append(this.genero);
        for (Hoja pagina:this.paginas) {
        sb.append("Págínas: ").append(pagina.imprimir()).append("\n");
        }
    return sb.toString();
    }
}
