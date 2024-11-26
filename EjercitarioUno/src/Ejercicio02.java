import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO 2 ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los dos valores: ");
        int a = Integer.parseInt(teclado.nextLine());
        int num = Integer.parseInt(teclado.nextLine());
        if(a>num) {
            System.out.printf("%d es mayor que %d" ,a,num);
        }else if (num>a){
                System.out.printf("%d es mayor que %d" ,num,a);
            } else if (a == num){
                System.out.println("a y num son iguales, ambos tienen el valor de: " +a);
            }
    }

}
