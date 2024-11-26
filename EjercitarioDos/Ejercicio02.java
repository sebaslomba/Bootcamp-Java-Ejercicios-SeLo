import java.util.Random;
public class Ejercicio02 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int[100];
        int contador = 0;
        int numero = 0 ;
        int max = 1;
        int valorMax = 0;

        for (int i=0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(-30,30);
            System.out.print("["+numeros[i] +"]" +" ");
            if (i == 25){
                System.out.print("\n");
            }
            if (i == 50){
                System.out.print("\n");
            }
            if (i == 75){
                System.out.print("\n");
            }
        }
        for(int j=0;j<numeros.length;j++){
            contador = 0;
            for(int k=numeros.length -1;k>0;k--){
                if(numeros[j] == numeros[k]){
                    contador++;
                    numero = numeros[j];   
                }
            }
           // System.out.println("["+numero+ "]" + " se repite: " +contador +" veces");
            if(max<contador){
                    max = contador;
                    valorMax = numeros[j];
                }
        }
        System.out.printf("\n\n el numero %d se repite unas %d veces.",valorMax,max);
        
        
        var arraystr = numeros.toString();
        for(int h=-30;h<30;h++){
            contador = 0;
            for(int z=0;z<numeros.length;z++){
               if( h == numeros[z]){
                   
                }else{
                   contador++; 
               }
            }
            if(contador >99){
                   System.out.printf("\nel numero %d    no pertenece" ,h);
               }
        }
    }
}
