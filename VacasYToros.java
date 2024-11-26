import java.util.Random;
import java.util.Scanner;

public class VacasYToros {
    public static void main(String[] args) {
            //genero el generador aleatorio y el scanner
            Random generador = new Random();
            Scanner teclado = new Scanner(System.in);
            
            int numeroCreado = generador.nextInt(9999)+1;
            while(numeroCreado<999){
                numeroCreado = generador.nextInt(9999)+1;
             //   System.out.println(numeroCreado);          
            }
           // System.out.println(numeroCreado);
            
            //convierto el numero a cadena para verificar si hay numeros iguales
            String numeroCadena = Integer.toString(numeroCreado);
            while(numeroCadena.charAt(0) == numeroCadena.charAt(1) || numeroCadena.charAt(0) == numeroCadena.charAt(2)||
                    numeroCadena.charAt(0) == numeroCadena.charAt(3) || numeroCadena.charAt(1) == numeroCadena.charAt(2)
                    || numeroCadena.charAt(1) == numeroCadena.charAt(3) || numeroCadena.charAt(2) == numeroCadena.charAt(3)){
                numeroCreado = Integer.parseInt(numeroCadena);
                numeroCreado = generador.nextInt(9999)+1;
                numeroCadena = Integer.toString(numeroCreado);
            //    System.out.println(numeroCadena);
            }
           //  numeroCreado = Integer.parseInt(numeroCadena);
            
            
            //pido ingresar por teclado los numeros
            System.out.println("Favor ingrese por teclado el numero de 4 digitos");
            var numeroIngresadoint = Integer.parseInt(teclado.nextLine());
            String numeroIngresado = Integer.toString(numeroIngresadoint);
            var ascUno = numeroIngresado.codePointAt(0);
            var ascDos = numeroIngresado.codePointAt(1);
            var ascTres = numeroIngresado.codePointAt(2);
            var ascCuatro = numeroIngresado.codePointAt(3);
            //verificamos que sea un numero de cuatro digitos
            if(numeroIngresado.length()<4){
                System.out.println("Favor ingresar un numero de cuatro digitos");
                 numeroIngresadoint = Integer.parseInt(teclado.nextLine());
                 numeroIngresado = Integer.toString(numeroIngresadoint);
            }
            
            
            //verificar si se ingreso un numero de verdad
            if(ascUno<47 || ascUno>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascDos<47 || ascDos>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascTres<47 || ascTres>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascCuatro<47 || ascCuatro>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            }
              
            //creamos variables vaca y toro
            int vacas = 0;
            int toros = 0;
            
            while(toros<4){
            //queda comparar los numeros
            if(numeroCadena.charAt(0) == numeroIngresado.charAt(0)){
                toros++;
            }
            if(numeroCadena.charAt(0) == numeroIngresado.charAt(1)){
                vacas++;
            }
            if(numeroCadena.charAt(0) == numeroIngresado.charAt(2)){
                vacas++;
            }
            if(numeroCadena.charAt(0) == numeroIngresado.charAt(3)){
                vacas++;
            }
            if(numeroCadena.charAt(1) == numeroIngresado.charAt(0)){
                vacas++;
            }
            if(numeroCadena.charAt(1) == numeroIngresado.charAt(1)){
                toros++;
            }
            if(numeroCadena.charAt(1) == numeroIngresado.charAt(2)){
                vacas++;
            }
            if(numeroCadena.charAt(1) == numeroIngresado.charAt(3)){
                vacas++;
            }
            if(numeroCadena.charAt(2) == numeroIngresado.charAt(0)){
                vacas++;
            }
            if(numeroCadena.charAt(2) == numeroIngresado.charAt(1)){
                vacas++;
            }
            if(numeroCadena.charAt(2) == numeroIngresado.charAt(2)){
                toros++;
            }
            if(numeroCadena.charAt(2) == numeroIngresado.charAt(3)){
                vacas++;
            }
            if(numeroCadena.charAt(3) == numeroIngresado.charAt(0)){
                vacas++;
            }
            if(numeroCadena.charAt(3) == numeroIngresado.charAt(1)){
                vacas++;
            }
            if(numeroCadena.charAt(3) == numeroIngresado.charAt(2)){
                vacas++;
            }
            if(numeroCadena.charAt(3) == numeroIngresado.charAt(3)){
                toros++;
            }
            
            System.out.println("toros = " + toros);
            System.out.println("vacas = " +vacas);
            
            //reiniciamos las variables para que no se acumulen
            if(toros == 4){
                System.out.println("Felicidades! El numero secreto era: " +numeroIngresado);  
                System.exit(0);
            }
            vacas = 0;
            toros = 0;
            
            //damos un nuevo intento
            
            System.out.println("Ingrese un nuevo intento, si desea salir pulse 'y'\n");
            numeroIngresado = teclado.nextLine();
            if(numeroIngresado.charAt(0) == 'y' || numeroIngresado.charAt(0) == 'Y'){
              System.out.println("Usted ha decidido terminar el programa");
              System.exit(0);
            }
            
                if(ascUno<47 || ascUno>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascDos<47 || ascDos>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascTres<47 || ascTres>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            } else if(ascCuatro<47 || ascCuatro>58){
                System.out.println("favor ingresar un numero valido: ");
                 numeroIngresado = teclado.nextLine();
            }
            }
         
         }
    }

