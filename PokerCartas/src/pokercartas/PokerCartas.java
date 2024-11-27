package pokercartas;
import java.util.Random;
import static pokercartas.Carta.generarManoAleatoria;

public class PokerCartas {
    public static void main(String[] args) {
     /*   Carta[] mano = {
            new Carta("A", 'S'),
            new Carta("K", 'S'),
            new Carta("Q", 'S'),
            new Carta("J", 'S'),
            new Carta("T", 'S')
        }; */
        Carta[] mano = generarManoAleatoria();

        // Mostrar las cartas generadas
        System.out.println("Mano generada:");
        for (Carta carta : mano) {
            System.out.println(Carta.imprimirCarta(carta));
        }

        if (Poker.esEscaleraColor(mano)) {
            System.out.println("Escalera Color");
        } else if (Poker.esPoker(mano)) {
            System.out.println("Poker");
        } else if (Poker.esFull(mano)) {
            System.out.println("Full House");
        } else if (Poker.color(mano)) {
            System.out.println("Color");
        } else if (Poker.escalera(mano)) {
            System.out.println("Escalera");
        } else if (Poker.esTrio(mano)) {
            System.out.println("Trío");
        } else if (Poker.esDoblePar(mano)) {
            System.out.println("Doble Par");
        } else if (Poker.esPar(mano)) {
            System.out.println("Par");
        } else {
            System.out.println("Carta Alta: " + Poker.cartaAlta(mano));
        }
    }
}
    