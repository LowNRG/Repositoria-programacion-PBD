import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Curso {
    @NonNull
    private final String nombre;
    private final int horas;

}
