package ejercicioclasesbootcampp;
import java.util.Scanner;

public class RelojDemo {
    
        public static void main(String[] args) {
            System.out.println("*** RELOJ ***");
            System.out.print("favor ingrese el tiempo en segundos:  ");
            Scanner teclado = new Scanner(System.in);
            int segundosIngresados = teclado.nextInt();
            Reloj primerReloj = new Reloj(segundosIngresados);
           // System.out.println(segundosTardios);// for(int i=0;i<10;i++){

           
           for(int a=0;a<10;a++){
            primerReloj.tick();
         // primerReloj.tickDecrement(); 
           }

            //nueva funcion agregada
            //imprimir desde la rama nueva-impresion
            System.out.println(primerReloj.toString());
           
           //meto los valores del segundo reloj por teclado
            System.out.printf("\nIngrese la cantidad de horas:  "); 
            int hours = teclado.nextInt();
            System.out.printf("\nIngrese la cantidad de minutos:  "); 
            int mins = teclado.nextInt();
            System.out.printf("\nIngrese la cantidad de segundos:  "); 
            int seconds = teclado.nextInt();
            int segundosegundoTotales = ((hours*3600)+(mins*60)+seconds);
            Reloj segundoReloj = new Reloj(segundosegundoTotales);
            
            Reloj relojSegundo = new Reloj(hours,mins,seconds);
            int restas = primerReloj.restaReloj(relojSegundo);
            //convierto a reloj
            System.out.println("\n");
            Reloj relojRestado = new Reloj(restas);
            System.out.printf(" <--- es el resultado de la diferencia de relojes [%02d:%02d:%02d] y [%02d:%02d:%02d]"
            .formatted(segundoReloj.getHoras(),segundoReloj.getMinutos(),segundoReloj.getSegundos(),primerReloj.getHoras(),primerReloj.getMinutos(),primerReloj.getSegundos()));
        }
}
