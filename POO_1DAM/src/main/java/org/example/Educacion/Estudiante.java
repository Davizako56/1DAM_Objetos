package org.example.Educacion;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
