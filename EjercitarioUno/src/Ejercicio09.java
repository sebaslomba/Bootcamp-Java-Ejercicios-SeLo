import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO NUEVE ***");
        Scanner teclado = new Scanner(System.in);
        String contra = "Asd23";
        int intentosRestantes = 3;

        for (int i=0; i<3; i++){
            System.out.println("tienes: " +intentosRestantes +" intentos.");
            String intento = teclado.nextLine();
            if(intento.equals(contra)){
                System.out.println("Correcto!");
                System.exit(0);
            }
            intentosRestantes--;
        }
        System.out.println("Fallaste jaja!!");
    }
}
