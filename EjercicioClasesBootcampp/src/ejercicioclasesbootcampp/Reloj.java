
package ejercicioclasesbootcampp;
import static java.lang.Math.abs;

public class Reloj {
    //agrego las tres instancias
    private int horas;
    private int minutos;
    private int segundos;
    
    
    //agrego los tres constructores
    public Reloj(){
        this.horas = 12;
        this.minutos = 00;
        this.segundos = 00;
    }
    
    public Reloj(int hora,int minuto,int segundo){
        this.horas = hora;
        this.minutos = minuto;
        this.segundos = segundo;
    }
    
    public Reloj(int segundosMedianoche){
            this.segundos = 0;
            this.minutos = 0;
            this.horas = 0;
        for(int x=0;x<segundosMedianoche;x++){
            segundos++;
            if(segundos > 59){
                minutos++;
                segundos = 0;
            }
            if(minutos > 59){
                horas++;
                minutos = 0;
            }
        }
        System.out.printf("[%02d:%02d:%02d] \t".formatted(horas,minutos,segundos));
    }


    //agrego los metodos
    public void setReloj(int valorTiempoMediaNoche){
        int segundeiros;
        valorTiempoMediaNoche = segundos;
        if(valorTiempoMediaNoche > 59){
            minutos++;
            valorTiempoMediaNoche = 0;
        }
        if(minutos > 59){
            horas++;
            minutos = 0;
        }
        segundeiros =(minutos*60) - valorTiempoMediaNoche;
        System.out.printf("la hora pasada desde la media noche es de: [%d:%02d:%02d] ".formatted(horas,minutos,segundeiros));
   
        

    //metodos get  
    }
    public int getHoras(){
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() { 
        return segundos;
    }
    
     //metodos set

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
     public void tick(){
          segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
         System.out.printf("\n[%02d:%02d:%02d]   +1 segundo".formatted(horas,minutos,segundos));
    }

         

    
    public void tickDecrement(){
       segundos--;
        if (segundos == -1) {
            segundos = 59;
            minutos--;
        if (minutos == -1) {
            minutos = 59;
            horas--;
        if (horas == -1) {
            horas = 23;
        }
        }
        }
        System.out.printf("\n[%02d:%02d:%02d]   +1 segundo".formatted(horas,minutos,segundos));
    }
    
    
    
    
    public void addReloj(Reloj reloj2){
        int totalSegundos = (this.horas * 3600 + this.minutos * 60 + this.segundos) + 
                            (reloj2.horas * 3600 + reloj2.minutos * 60 + reloj2.segundos);
        this.horas = (totalSegundos / 3600) % 24;
        this.minutos = (totalSegundos / 60) % 60;
        this.segundos = totalSegundos % 60;
        System.out.printf("[%02d:%02d:%02d] \n".formatted(horas,minutos,segundos));
    }
    
    
    public void horaPasada(){
        int result = 0;
        int pasaMinutos = 0;
        int pasaSegundos=0;
        if(horas>23){
            result = horas-23;
            pasaMinutos = result * 60;
            pasaSegundos = pasaMinutos * 60;
            //int valorTiempoMediaNoche = pasaSegundos;
            setReloj(pasaSegundos);
        }
    }
    
    public void toString(int horas, int minutos, int segundos){
        String horasS = String.valueOf(this.horas);
        String minutosS = String.valueOf(this.minutos);
        String segundosS = String.valueOf(this.segundos);
        
        //String relojS = "["+horasS+":"+minutosS+":"+segundosS+"]";
            if(horas<10){
                horasS = "0" + String.valueOf(this.horas);
            } 
            if(minutos<10){
                minutosS = "0"+String.valueOf(this.minutos);
            }
            if(segundos<10){
                segundosS = "0"+String.valueOf(this.segundos);
            }
        String relojS = "["+horasS+":"+minutosS+":"+segundosS+"]";  
        System.out.println(relojS);
    }
    public int restaReloj(Reloj reloj2){
            int thisTotalSegundos = this.horas * 3600 + this.minutos * 60 + this.segundos;
            int otroTotalSegundos = reloj2.horas * 3600 + reloj2.minutos * 60 + reloj2.segundos;
            return abs(thisTotalSegundos - otroTotalSegundos);
            }
        }
        
    
    