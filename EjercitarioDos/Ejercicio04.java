public class Ejercicio04 {
    
    public static void main(String[] args) {
       String numeros = "2148190842303";

       int[] valores = new int [numeros.length()];
       for(int i=0;i<numeros.length();i++){
           valores[i] = Integer.parseInt(String.valueOf(numeros.charAt(i)));
           
           System.out.printf("["+ valores[i] +"]"+" ");
       }
    }
}
