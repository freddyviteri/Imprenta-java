package com.fhviteri.pooimprenta;

import com.fhviteri.pooimprenta.modelo.*;

public class Imprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Hugo Viteri", "Ingeniero en Sistemas","Resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Orable dba");
        cv.addExperiencia("Sring Framework");
        cv.addExperiencia("Desarrollador fullstack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Kenneth ","Progrmación avanzada ", Genero.PROGRAMACION);
libro.addPagina(new Pagina("Patron sigleton"))
        .addPagina(new Pagina("Patrom Observador"))
        .addPagina(new Pagina("Patron Proxy"));

        Informe informe = new Informe("Martin Fowler","Alan","Estudio de microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
    public static void  imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
