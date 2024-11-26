
import java.util.Random;
import java.util.Scanner;
public class NimSebas {
    public static void main(String[] args) {
        //introduzco variables
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        Random monedas = new Random();
        int cantidad, resultado=10;
        String mayus = "* EJERCICIO JUEGO NIM SEBAS *";
        String mayusc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        char decisionUnoReal, decisionDosReal;
        String decisionUno;
        String decisionDos;
        
        //colocar generadores de pilas 
        System.out.println(mayus);
        int cantidadPilaUno = monedas.nextInt(19) + 1;
        int cantidadPilaDos = monedas.nextInt(19) + 1;
        int cantidadPilaTres = monedas.nextInt(19) + 1;
        System.out.println("Pila 1 = " + cantidadPilaUno);
        System.out.println("Pila 2 = " + cantidadPilaDos);
        System.out.println("Pila 3 = " + cantidadPilaTres);
        //ingreso de participantes
        System.out.print("\nJugador 1, ingrese su nombre: ");
        String jugadorUno = teclado.nextLine();
        System.out.print("Jugador 2, favor ingrese su nombre: ");
        String jugadorDos = teclado.nextLine();
        //funcion en ciclo do-while
            do {
                System.out.printf(" %s, favor ingrese una opcion: \n A   B   C \t\t".formatted(jugadorUno));
                decisionUno = teclado.nextLine();
                mayus = decisionUno.toUpperCase();
                //decisionUnoReal = mayus.charAt(0);
                switch (mayus) {
                    case "A":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorUno));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaUno || cantidad == cantidadPilaUno)) {
                            cantidadPilaUno = cantidadPilaUno - cantidad;
                            resultado = cantidadPilaUno;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));
                        }
                        break;
                

                    case "B":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorUno));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaDos || cantidad == cantidadPilaDos)) {
                            cantidadPilaDos = cantidadPilaDos - cantidad;
                            resultado = cantidadPilaDos;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));
                        }
                        break;
                
                    case "C":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorUno));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaTres || cantidad == cantidadPilaTres)) {
                            cantidadPilaTres = cantidadPilaTres - cantidad;
                            resultado = cantidadPilaTres;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));
                        }
                        break;
                
                    default: System.out.print("el valor que ingreso supera la cantidad de pilas o no esvalido");
                }
                    if (resultado < 1) {
                     System.out.printf("\t\t%s, ganaste!!!".formatted(jugadorUno));
                     System.exit(0);
                    }


                System.out.printf("\n --------------------------------- \n %s, favor ingrese una opcion: \n A   B   C\t\t".formatted(jugadorDos));
                decisionDos = tecladoDos.nextLine();
                mayusc = decisionDos.toUpperCase();
              //  decisionDosReal = mayusc.charAt(0);
                switch (mayusc) {
                    case "A":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorDos));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaUno || cantidad == cantidadPilaUno)) {
                            cantidadPilaUno = cantidadPilaUno - cantidad;
                            resultado = cantidadPilaUno;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));

                        }
                        break;
                

                    case "B":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorDos));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaDos || cantidad == cantidadPilaDos)) {
                            cantidadPilaDos = cantidadPilaDos - cantidad;
                            resultado = cantidadPilaDos;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));

                        }
                        break;
                
                    case "C":
                        System.out.printf("%s ingrese la cantidad que desee restar: ".formatted(jugadorDos));
                        cantidad = teclado.nextInt();
                        if (cantidad > 0 && (cantidad < cantidadPilaTres || cantidad == cantidadPilaTres)) {
                            cantidadPilaTres = cantidadPilaTres - cantidad;
                            resultado = cantidadPilaTres;
                            System.out.printf("A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));

                        }
                        break;
                
                default:
                    System.out.println("el valor que ingreso supera la cantidad de pilas o no es valido");
                    }
                if(resultado <1) {
                    System.out.printf("\t\t%s, ganaste!!!".formatted(jugadorDos));
                    System.exit(0);

                    System.out.printf("\t A: %d\tB: %d\tC: %d".formatted(cantidadPilaUno, cantidadPilaDos, cantidadPilaTres));
                }
            } while (cantidadPilaUno>0 && cantidadPilaDos > 0 && cantidadPilaTres > 0);
    }
}


