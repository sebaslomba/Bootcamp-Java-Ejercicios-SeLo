
public class Ejercicio03 {
    public static void palindrome(String frase){
        int contador = 0;
       // String[] prueba = new String[frase.length()];
       //String letra;
        int t = 0;
        for(int x=0;x<frase.length();x++){
            t++;
            if(frase.charAt(x) != frase.charAt(frase.length()-t)){
                System.out.printf("la palabra %s no es polindrome" ,frase);
                System.exit(0);
            }else{
                contador++;
            }
        }
        if(contador > 2){
      // if(contador>0 && contador<frase.length()){
            System.out.printf("\n la palabra %s si es polindrome. " ,frase);
        }else{
            System.out.printf(" %s no es palindrome",frase);
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        palindrome("racecar");
    }
}
