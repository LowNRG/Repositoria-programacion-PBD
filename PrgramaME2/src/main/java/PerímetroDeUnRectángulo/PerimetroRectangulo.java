package PerímetroDeUnRectángulo;

public class PerimetroRectangulo {

    int X;
    int y;

    public PerimetroRectangulo(int X, int y){
        this.X = X;
        this.y = y;
        calcularPerimetro();
    }
    public void calcularPerimetro(){
        int perimetro = 2 * (X + y);
        System.out.println(perimetro);
    }
}
