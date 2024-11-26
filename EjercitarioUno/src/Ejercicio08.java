import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO OCHO ***");
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Favor ingrese un numero mayor o igual a cero");
            numero = teclado.nextInt();
        }while(numero<0);
        System.out.println("numero = " + numero);
    }
}
