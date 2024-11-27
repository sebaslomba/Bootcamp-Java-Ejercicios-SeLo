package juegopoker;

import java.util.Random;
import static juegopoker.Cartas.generadorMano;
import static juegopoker.Cartas.imprimirCarta;
import static juegopoker.Cartas.myClass;




public class JuegoPoker {
    public static void main(String[] args) 
    {
        /*   Carta[] mano = {
            new Carta("A", 'S'),
            new Carta("K", 'S'),
            new Carta("Q", 'S'),
            new Carta("J", 'S'),
            new Carta("T", 'S')
        }; */
        Cartas[] mano = generadorMano();
        Cartas[][] manos = new Cartas[2][5];
        for (int i = 0; i < manos.length; i++) 
        {
         manos[i] = generadorMano(); 
        
        }
        // Imprimir las cartas de cada mano por separado 
    System.out.println("Cartas generadas por separado:");
     for (int i = 0; i < manos.length; i++)
     {
         System.out.println("Mano " + (i + 1) + ":");
         for (Cartas carta : manos[i])
         {
             System.out.println("  " + imprimirCarta(carta)); 
         }
     }
      // Imprimir las manos completas
    System.out.println("\nManos generadas:");
    for (int i = 0; i < manos.length; i++) {
        System.out.print("Mano " + (i + 1) + ": ");
        for (Cartas carta : manos[i]) {
            System.out.print(imprimirCarta(carta) + " ");
        }
        System.out.println();
    }

    // Determinar la mano ganadora
    String resultado = myClass(manos);
    System.out.println("\n" + resultado);

    }
    
}
