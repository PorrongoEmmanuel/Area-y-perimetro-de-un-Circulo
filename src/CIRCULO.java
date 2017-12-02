import java.util.Scanner;

public class CIRCULO {

    public void area(){

        double area;
        double perimetro;

        System.out.println("inserte el radio del circulo: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextFloat();
        System.out.println("");
        area =  (3.14159*radio*radio);
        System.out.println("el area del circulo es: "+ area);
        System.out.println("");

        perimetro = 2*Math.PI*radio;
        System.out.println("el perimetro del circulo es: "+ perimetro);





    }
}
