import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO DIEZ ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana.");
        String dia = teclado.nextLine();
        String dias = dia.toUpperCase();

        if(dias.equals("DOMINGO") || dias.equals("LUNES") || dias.equals("MARTES") ||
                dia.equals("MIERCOLES") || dias.equals("JUEVES") || dias.equals("VIERNES")
                || dias.equals("SABADO")) {
            switch (dias){
                case "DOMINGO":
                    System.out.println(" no es dia laboral");
                    break;
                case "LUNES":
                    System.out.println(" es dia laboral");
                    break;
                case "MARTES":
                    System.out.println(" es dia laboral");
                    break;
                case "MIERCOLES":
                    System.out.println(" es dia laboral");
                    break;
                case "JUEVES":
                    System.out.println(" es dia laboral");
                    break;
                case "VIERNES":
                    System.out.println(" es dia laboral");
                    break;
                case "SABADO":
                    System.out.println(" no es dia laboral");
                    break;
            }
        } else {
            System.out.println("Favor escribir un dia valido. ");
            dia = teclado.nextLine();
            dias = dia.toUpperCase();
            switch (dias){
                case "DOMINGO":
                    System.out.println(" no es dia laboral");
                    break;
                case "LUNES":
                    System.out.println(" es dia laboral");
                    break;
                case "MARTES":
                    System.out.println(" es dia laboral");
                    break;
                case "MIERCOLES":
                    System.out.println(" es dia laboral");
                    break;
                case "JUEVES":
                    System.out.println(" es dia laboral");
                    break;
                case "VIERNES":
                    System.out.println(" es dia laboral");
                    break;
                case "SABADO":
                    System.out.println(" no es dia laboral");
                    break;
                default:
                    System.out.println("No ingresó un dia valido.");
                    System.exit(0);
            }
        }


    }
}
