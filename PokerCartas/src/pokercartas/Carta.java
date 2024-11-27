package pokercartas;
import java.util.Random;

public class Carta {
    private String valor;
    private char palo;
    
    public Carta(String valor,char palo){
        this.valor = valor;
        this.palo = palo;
    }
    
    public String getValor(){
        return valor;
    }
    public char getPalo(){
        return palo;
    }
    
    public int getValorNumerico(){
        switch(valor){
            case "A":
                return 14;
            case "K":
                return 13;
            case "Q":
                return 12;
            case "J":
                return 11;
            case "T":
                return 10;
            default: return Integer.parseInt(valor);
        }
    }
    public static Carta[] generarManoAleatoria() {
    Random random = new Random();
    String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    char[] palos = {'S', 'C', 'H', 'D'};

    Carta[] mano = new Carta[5];
    for (int i = 0; i < 5; i++) {
        String valor = valores[random.nextInt(valores.length)]; // Valor aleatorio
        char palo = palos[random.nextInt(palos.length)];       // Palo aleatorio
        mano[i] = new Carta(valor, palo);
    }
    return mano;
}
    public static String imprimirCarta(Carta carta) {
    String valor = carta.getValor();
    char palo = carta.getPalo();

    // Traducción del valor
    String nombreValor;
    switch (valor) {
        case "A": nombreValor = "AS"; break;
        case "K": nombreValor = "K"; break;
        case "Q": nombreValor = "Q"; break;
        case "J": nombreValor = "J"; break;
        case "T": nombreValor = "10"; break;
        default: nombreValor = valor; break; // Para valores numéricos del 2 al 9
    }

    // Traducción del palo
    String nombrePalo;
    switch (palo) {
        case 'S': nombrePalo = "Picas"; break;
        case 'C': nombrePalo = "Treboles"; break;
        case 'H': nombrePalo = "Corazones"; break;
        case 'D': nombrePalo = "Diamantes"; break;
        default: nombrePalo = "Desconocido"; break;
    }

    return valor + palo + " > " + nombreValor + " de " + nombrePalo;
}
}
