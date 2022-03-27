package com.fhviteri.pooimprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements IImprimible{

    private String persona;
    private String carrera;

    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona=persona;
        this.carrera=carrera;
        this.experiencias= new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombres: ").append(persona).append("\n")
                .append("Resumen: ").
                append(this.contenido).append('\n')
                .append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiancia: ");
        for (String experiancia:experiencias) {
            sb.append(" - ").append(experiancia).append("\n");
        }

        return sb.toString();
    }
}
