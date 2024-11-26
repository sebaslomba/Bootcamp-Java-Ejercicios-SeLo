import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO CINCO ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int numero = teclado.nextInt();

        if(numero%2 == 0){
            System.out.println("El numero ingresado si es divisible por 2");
        } else {
            System.out.println("El numero no es divisible por 2");
        }
    }
}
