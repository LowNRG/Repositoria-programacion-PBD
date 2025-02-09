import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Instituto {
    @NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

public Instituto(String nombre){
    this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
}
public void agregarEstudiante(@NonNull Estudiante estudiante){
    estudiantes.add(estudiante);
}
public void agregarCurso(@NonNull Curso curso){
    if(!curso.equals(cursos)){
        cursos.add(curso);
    }else{
        System.out.println("El curso esta duplicado no se puede añadir");
    }
}
public ArrayList<Estudiante> getListaEstudiantes(){
    return new ArrayList<>(estudiantes);
}
public ArrayList<Curso> getListaCursos(){
    return new ArrayList<>(cursos);
}
}

