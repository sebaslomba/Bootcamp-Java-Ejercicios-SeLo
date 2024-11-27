package juegopoker;

import java.util.Random;

public class Cartas {
   private String valor;
   private String palo;
   
   public Cartas(String valor,String palo)
   {
       this.palo = palo;
       this.valor = valor;
   }
    
   
   public Cartas(String completo)
   {
       this.valor = String.valueOf(completo.charAt(0));
       this.palo = String.valueOf(completo.charAt(1));
   }
   String getPalo()
   {
       return palo;
   }
   String getValor()
   {
       return valor;
   }  
   public int getValorNumerico()
   {
        switch(valor)
        {
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
   public static Cartas[] generadorMano()
   {
       Random randomizer = new Random();
       String[] valores = {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
       String[] palos = {"S","C","H","D"};
       
       Cartas[] mano = new Cartas[5];
       for(int i=0;i<5;i++)
       {
           String valor = valores[randomizer.nextInt(valores.length)];
           String palo = palos[randomizer.nextInt(palos.length)];
           mano[i] = new Cartas (valor,palo);
       }
       return mano;
   }
    public static String imprimirCarta(Cartas carta)
    {
        String valor = carta.getValor();
        String palo = carta.getPalo();
        String nombreValor;

       switch(valor)
       {
           case "A": nombreValor = "AS"; break;
           case "K": nombreValor = "K"; break;
           case "Q": nombreValor = "Q"; break;
           case "J": nombreValor = "J"; break;
           case "T": nombreValor = "T"; break;
           default: nombreValor = valor; break;
       }
       String nombrePalo;
       switch(palo) 
       {
            case "S": nombrePalo = "Picas"; break;
            case "C": nombrePalo = "Treboles"; break;
            case "H": nombrePalo = "Corazones"; break;
            case "D":nombrePalo = "Diamantes"; break;
            default: nombrePalo = "Desconocido"; break;
        }
       return valor + palo + " > " + nombreValor + " de " + nombrePalo;
   }
     private static int[] contarValores(Cartas[] carta) 
     {
        int[] conteo = new int[15]; // 1 a 14 (se ignora índice 0)
        for (Cartas cartaa : carta) {
            conteo[cartaa.getValorNumerico()]++;
        }
        return conteo;
    }
     private static boolean tieneRepetidos(Cartas[] carta, int a) {
        int[] conteo = contarValores(carta);
        for (int c : conteo) {
            if (c == a)
            {
                return true;
            }
        }
        return false;
    }

    private static int contarRepetidos(Cartas[] carta, int b) {
        int[] conteo = contarValores(carta);
        int total = 0;
        for (int c : conteo) {
            if (c == b) total++;
        }
        return total;
    }
    //veo si todos los colores son iguales
    public static boolean colores(Cartas[] carta)
    {
        String primerPalo = carta[0].getPalo();
        for(int i=0;i<carta.length;i++)
        {
            if(carta[i].getPalo() != primerPalo)
            {
               return false; 
            }
        }
        return true;
    }
    //veo si se cumple la escalera
    public static boolean escalera(Cartas[] carta)
    {
        //vargamos los valores NUMERICOS en un nuevo array
        int[] valores = new int[carta.length];
        for(int i=0;i<carta.length;i++)
        {
            valores[i] = carta[i].getValorNumerico();
        }
        
        //los ordeno con metodo burbuja
        for (int i=0;i<valores.length -1;i++) {
            for (int j=0;j<valores.length -i -1;j++) 
            {
                if (valores[j] > valores[j + 1]) 
                {
                    int aux = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = aux;
                }
            }
        }
        //verifico secuencia normal
        boolean secuencia = true;
        for(int i=0;i<valores.length-1;i++)
        {
            if(valores[i]+1 != valores[i+1])
            {
                secuencia = false;
                break;
            }
        }
        //contando A como 1
        boolean secuenciaAsBajo = valores[0] == 2 && valores[1] == 3 && valores[2] == 4 &&
                valores[3] == 5 && valores[4] == 14;
        return secuencia || secuenciaAsBajo;
    }
    //escalera color
    public static boolean escaleraColor(Cartas[] carta)
    {
        return (colores(carta) && escalera(carta));
    }
    //poker
    public static boolean poker(Cartas[] carta)
    {
      return tieneRepetidos(carta, 4);  
    }
    //Full 
    public static boolean full(Cartas[] carta)
    {
        int[] conteo = contarValores(carta);
        boolean tieneTres = false, tieneDos = false;

        for (int c : conteo)
        {
            if (c == 3)
            {
                tieneTres = true;
            }
            if (c == 2)
            {
                tieneDos = true;
            }
        }

        return tieneTres && tieneDos;
    }

    // Trío
    public static boolean trio(Cartas[] carta)
    {
        return tieneRepetidos(carta, 3);
    }

    // Verifica Doble Par
    public static boolean doblePar(Cartas[] carta) {
        int[] conteo = contarValores(carta);
        int pares = 0;

        for (int c : conteo) {
            if (c == 2)
            {
                pares++;
            }
        }
        return pares == 2;
    }

    //Par
    public static boolean par(Cartas[] carta) {
        return contarRepetidos(carta, 2) == 1;
    }

    // Carta Alta
    public static String cartaAlta(Cartas[] carta) {
        Cartas mayor = carta[0];
        for (int i = 1; i < carta.length; i++) 
        {
            if (carta[i].getValorNumerico() > mayor.getValorNumerico())
            {
                mayor = carta[i];
            }
        }
        return mayor.getValor();
    }
    
    ////////////////////////////////////////////
    //metodos con ambos jugadores
     public static String myClass(Cartas[][] manos){
         int mejorValor = -1;  //valor mas alto encontrado
         int indiceGanador = -1;  //indice de mano ganadora
        
        for(int i=0;i<manos.length;i++)
        {
            int valorMano = evaluarMano(manos[i]);
            System.out.println("Mano "+ (i+1)+ " tiene un valor de: " +valorMano);
            
            if(valorMano>mejorValor)
            {
                mejorValor= valorMano;
                indiceGanador = i;
            }
            
        }
        return "la mano ganadora es la numero: "+(indiceGanador+1);
    }
    public static int evaluarMano(Cartas[] mano){
        if (escaleraColor(mano)) return 8; 
        if (poker(mano)) return 7;
        if (full(mano)) return 6;
        if (colores(mano)) return 5;
        if (escalera(mano)) return 4;
        if (trio(mano)) return 3;
        if (doblePar(mano)) return 2;
        if (par(mano)) return 1;
        return 0;                            
    }

    
}
         
