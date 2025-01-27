

public class Paciente (){
    private final static char GENERO_DEF = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    private final static int MAYOR_EDAD = 18;

    private String nombre;
    private String dni;
    private int edad;
    private char genero;
    private float peso;
    private float altura;


    public Paciente(String nombre, String dni, int edad, char genero, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    public void mostrarInfoPaciente (){
        System.out.println();
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Eddad: " + this.edad);
        System.out.println("Genero: " + this.genero);
        System.out.println("DNI: " + this.dni);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);

    }
    public int calcularIMC(){
        double imc = peso/(Math.pow(altura,2));

        if(imc <20){
            return PESO_BAJO;
        }else if (imc>25){
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }
    }
    public boolean esMayordeEdad(){
        if(edad>=MAYOR_EDAD){
            return true;
        }
        return false;
    }
    private void comprobarSexo(char sexo){

        if(sexo != 'H' && sexo != 'M'){
            this.genero= GENERO_DEF;
        }else{
            this.genero = sexo;
        }
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public char getGenero() {
        return this.genero;
    }
    public String getDni(){
        return this.dni;
    }
    public float getPeso(){
        return this.peso;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public char setGenero(char genero){
        comprobarSexo(genero);
    }
    public void setaltura(float altura){
        this.altura = altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    @Override
    public String toString(){
        return System.out.println("Paciente con nombre " + this.nombre + " y " + this.edad + " años de edad. Genero " + this.genero + " y peso " + this.peso + " con altura " + this.altura);
    }
}
