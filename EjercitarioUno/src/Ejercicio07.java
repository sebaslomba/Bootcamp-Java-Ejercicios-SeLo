public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO SIETE ***");
        int contador = 0;
        for(contador=1; contador<101 ; contador++){
            if (contador % 2 == 0 && contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }
}
