import java.util.Scanner;

public class Punto {

    private int x;//representa la absisa
    private int y;//representa la ordenada

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimir_cuadrante(int x, int y) {
        if (getX() > 0 && getY() > 0) {
            System.out.println("El punto esta en el primer cuadrante");
        } else if (getX() < 0 && getY() > 0) {
            System.out.println("El punto esta en el segundo cuadrante");
        } else if (getX() < 0 && getY() < 0) {
            System.out.println("El punto esta en el tercer cuadrante");
        } else {
            System.out.println("El punto esta en el cuarto cuadrante");
        }
    }

    public void calcular_distancia(int x2, int y2) {
        float a = (x2 - getX()) * (x2 - getX());
        float b = (y2 - getY()) * (y2 - getY());
        double d = Math.sqrt(a + b);
        System.out.println("La distancia es de:" + d);
    }

    public void distancia_media(int x2, int y2) {
        float Xm = (getX() + x2) / 2;
        float Ym = (getY() + y2) / 2;
        System.out.println("El punto medio es:("+Xm+","+Ym+")");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Punto objeto = new Punto(2,1);//valores predefinidos
        System.out.println("Teclee el valor para X:");
        int x = teclado.nextInt();
        System.out.println("Teclee el valor para y:");
        int y = teclado.nextInt();
        objeto.imprimir_cuadrante(2,1);//Imprime cuadrante predefinido punto A
        objeto.imprimir_cuadrante(x,y);//Imprime cuadrante definido por el usuario
        objeto.calcular_distancia(x, y);
        objeto.distancia_media(x, y);
    }

}
