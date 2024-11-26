import java.util.Random;
public class Ejercicio01 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int max=-5;
        int min=5;
        int[] numeros = new int[10];
        
        for(int i =0;i<numeros.length;i++){
           numeros[i] = aleatorio.nextInt(-5,6);
            System.out.print("["+numeros[i] +"]" +" ");
           
        }
       for(int j=0; j<numeros.length;j++){
           if(numeros[j] < min){
               min = numeros[j];
           }
           if(numeros[j]> max){
               max = numeros[j];
           }
       }
        System.out.println("\n"+min +" es el minimo valor");
        System.out.println(max +" es el maximo valor");
    }
}
