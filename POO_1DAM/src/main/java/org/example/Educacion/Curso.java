package org.example.Educacion;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;
}
