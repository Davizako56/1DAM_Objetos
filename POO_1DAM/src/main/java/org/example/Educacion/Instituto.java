package org.example.Educacion;
import lombok.*;

import java.util.ArrayList;

@ToString
@RequiredArgsConstructor
@Getter
public class Instituto {

    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private int codigo;
    @Setter
    private ArrayList<Estudiante> listaEstudiantes;
    @Setter
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre, String poblacion, int codigo) {

        this.nombre = nombre;
        this.poblacion = poblacion;
        this.codigo = codigo;
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }


    public void agregarEstudiante(Estudiante estudiante) {

        if (estudiante == null) {
            System.out.println("No se puede agregar un estudiante nulo");
        }else{
            listaEstudiantes.add(estudiante);
        }

    }

    public void agregarCurso(Curso curso) {

        if (curso == null) {
            System.out.println("No se puede agregar un curso nulo");
        }else{

            for (Curso c : listaCursos) {
                if(curso == c) {
                    System.out.println("Este curso ya está en la lista");
                    return;
                }
            }
            listaCursos.add(curso);
        }
    }
}
