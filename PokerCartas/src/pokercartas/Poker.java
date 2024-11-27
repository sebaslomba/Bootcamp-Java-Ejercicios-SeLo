
package pokercartas;


public class Poker {
    //ve si todas las cartas tienen el mismo palo
    public static boolean color(Carta[] cartas){
        char primerPalo = cartas[0].getPalo();
        for(int i=0;i<cartas.length;i++){
            if(cartas[i].getPalo() != primerPalo){
                return false;
            }
        }
        return true;
    }
    //ve si las cartas estan en orden secuencial
    public static boolean escalera(Carta[] cartas){
        int[] valores = new int[cartas.length];
        for(int i=0;i<cartas.length;i++){
            valores[i] = cartas[i].getValorNumerico();
        }
        
        //metodo burbuja
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = 0; j < valores.length - i - 1; j++) {
                if (valores[j] > valores[j + 1]) {
                    int aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        }
        
        //verifico secuencia normal
        boolean secuencia = true;
        for(int i=0;i<valores.length-1;i++){
            if(valores[i]+1 != valores[i+1]){
                secuencia = false;
                break;
            }
        }
        
        //verificar escalera con As como 1
        boolean secuenciaAsBajo = valores[0] == 2 && valores[1] == 3 && valores[2] == 4 &&
                valores[3] == 5 && valores[4] == 14;

        return secuencia || secuenciaAsBajo;
    }
    // Verifica Escalera Color
    public static boolean esEscaleraColor(Carta[] cartas) {
        return color(cartas) && escalera(cartas);
    }

    // Verifica Poker
    public static boolean esPoker(Carta[] cartas) {
        return tieneRepetidos(cartas, 4);
    }

    // Verifica Full House
    public static boolean esFull(Carta[] cartas) {
        int[] conteo = contarValores(cartas);
        boolean tieneTres = false, tieneDos = false;

        for (int c : conteo) {
            if (c == 3) tieneTres = true;
            if (c == 2) tieneDos = true;
        }

        return tieneTres && tieneDos;
    }

    // Verifica Trío
    public static boolean esTrio(Carta[] cartas) {
        return tieneRepetidos(cartas, 3);
    }

    // Verifica Doble Par
    public static boolean esDoblePar(Carta[] cartas) {
        int[] conteo = contarValores(cartas);
        int pares = 0;

        for (int c : conteo) {
            if (c == 2) pares++;
        }

        return pares == 2;
    }

    // Verifica Par
    public static boolean esPar(Carta[] cartas) {
        return contarRepetidos(cartas, 2) == 1;
    }

    // Carta Alta
    public static String cartaAlta(Carta[] cartas) {
        Carta mayor = cartas[0];
        for (int i = 1; i < cartas.length; i++) {
            if (cartas[i].getValorNumerico() > mayor.getValorNumerico()) {
                mayor = cartas[i];
            }
        }
        return mayor.getValor();
    }

    // Métodos auxiliares
    private static int[] contarValores(Carta[] cartas) {
        int[] conteo = new int[15]; // 1 a 14 (se ignora índice 0)
        for (Carta carta : cartas) {
            conteo[carta.getValorNumerico()]++;
        }
        return conteo;
    }

    private static boolean tieneRepetidos(Carta[] cartas, int n) {
        int[] conteo = contarValores(cartas);
        for (int c : conteo) {
            if (c == n) return true;
        }
        return false;
    }

    private static int contarRepetidos(Carta[] cartas, int n) {
        int[] conteo = contarValores(cartas);
        int total = 0;
        for (int c : conteo) {
            if (c == n) total++;
        }
        return total;
    }
}



