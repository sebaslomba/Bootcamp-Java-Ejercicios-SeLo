import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO CUATRO ***");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido " +nombre);
    }

}
