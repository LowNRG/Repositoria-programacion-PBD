import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter

public class Estudiante {

    private final String nombre;
    private int edad;
    private Curso curso;
}
