
import java.io.Serializable;

public class Coche implements Serializable{
    public String Marca;
    public int Kilometros;
    public transient String Matricula;

    public Coche(String Marca, int Kilometros, String Matricula){
        this.Marca = Marca;
        this.Kilometros = Kilometros;
        this.Matricula = Matricula;
    }
    public String getMatricula() {
        return Matricula;
    }

    public String toString() {
        return "El coche de la Marca" + Marca  + ", tiene de Kilometros = " + Kilometros + ", y su Matricula es = '" + Matricula + '\'' ;
    }
}