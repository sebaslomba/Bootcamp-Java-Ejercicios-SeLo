import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO SEIS ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** en caso de decimales FAVOR USAR comas ***");
        System.out.printf("Ingrese el precio de su producto: ");
        double precio = teclado.nextDouble();

        final double IVA = 1.1;

        System.out.println("El precio sin IVA es de: "  +precio);
        System.out.printf("El precio total con IVA es de: %.2f " ,(precio*IVA));


    }
}
