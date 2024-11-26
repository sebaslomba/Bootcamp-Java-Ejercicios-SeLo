
package ejercicioclasesbootcampp;
import java.util.Arrays;
import java.util.Random;

public class GeneralaSebas {
    public static void main(String[] args) {
        //crear dado y tirarlo 5 veces
        Random dado = new Random();
        int conteo=0,conteoDos=0,conteoTres=0;
        int[] valores = new int[5];
        for(int a=0;a<5;a++){
            valores[a] = dado.nextInt(6)+1;
            System.out.print(valores[a]+"  ");
        }
        //ordeno el array
        Arrays.sort(valores);
        System.out.println("\n");
        System.out.println("Valores Ordenados:   "+Arrays.toString(valores));
        
        for(int b=0;b<4;b++){
            if(valores[b] == valores[b+1]){
                conteo++;
            }
        }
        if(conteo>3){
            System.out.println("GENERALA \t");
            System.exit(0);
        }else if(conteo == 3 && (valores[0] != valores[1] || valores[4] != valores[3])){
            System.out.println("POKER");
            System.exit(0);
        }else if(conteo == 3){
            for(int c=0;c<5;c++){
                if(valores[3] == valores[4] && (valores[0] == valores[1] && valores[0]!= valores[2])){
                    conteoDos++;
                }else if(valores[1] == valores[2]  && valores[3] == valores[4] && valores[4] != valores[2]){
                    conteoDos++;
                }else{
                    conteoDos = 0;
                }
            }
            if(conteoDos>0){
                System.out.println("FULL \t");
                System.exit(0);
            }
        }else if(conteo ==0){
            for(int c=0;c<4;c++){
                if(valores[c]+1 == valores[c+1]){
                    conteoTres++;
                }else{
                    System.out.println("NADA");
                }
            }
            if(conteoTres==4){
                System.out.println("ESCALERA \t");
                System.exit(0);
            }
        }else if(conteo<3 && conteoDos<1){
            System.out.println(" NADA ");
            System.exit(0);
        }
    }
}