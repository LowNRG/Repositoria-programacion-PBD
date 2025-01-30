package biblioteca;

public class Libro {

    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;
    public static String LIB = "LIB";

    private Editorial editorial;
    private String id;
    private boolean disponible;
    private String autor;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void libro (String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
        cantidadLibros++;
        librosDisponibles++;
        id = LIB+calcularId(cantidadLibros);
        disponible = true;

    }
    public static String calcularId(int cantidadLibros){

        return String.format("%03d",cantidadLibros);
    }
    public void prestar(){
        if(disponible) {
            disponible = false;
            System.out.println("El libro "+getTitulo()+ " ha sido prestado con éxito.");
            librosDisponibles--;
        }else{
            System.out.println("El libro "+getTitulo()+ " no se pude prestar");
        }

    }
    public void devolver(){
        if(!disponible) {
            disponible = true;
            System.out.println("EL libro "+getTitulo()+ " ha sido devuelto con éxito");
            librosDisponibles++;
        }else{
            System.out.println("El libro "+getTitulo()+ " no se puede devolver.(No esta disponible)");
        }
    }
    public Prestamo prestar(Estudiante estudiante){

        if(disponible && !estudiante.getLibrosPrestados().contains(this)){
            disponible = false;
            System.out.println();
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado el prestamo" + prestamo);
            return prestamo;
        }else if (estudiante.getLibrosPrestados().contains(this)){

        }
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }
    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }
    @Override
    public String toString(){
        return "biblioteca.Libro : \nTitulo= " + getTitulo() + " \nAutor= " + getAutor() + " \nID= " + getId() + "\nDisponible= " +isDisponible();
    }


}