

import java.util.*;

public class DispensadorBotes {

    private int boteCola=15;
    private int boteLimon=15;
    private int boteNaranja=15;
    private int boteTonica=15;
    private int boteAgua=15;
    
    
    
    public void IniciarDispensadorDeBotes (int i){
        
        Scanner tec=new Scanner(System.in);
        int opcion;
        boolean monedaIn = true;
        boolean stock= true;
        do{
            System.out.println("1- Cola");
            System.out.println("2- Limon");
            System.out.println("3- Naranja");
            System.out.println("4- Tonica");
            System.out.println("5- Agua");
            System.out.println("0- ");
            opcion=tec.nextInt();
            switch(opcion){
                case 1:
                    if(boteCola!=0){
                        System.out.println(stock);
                        boteCola--;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    
                    break;
                   
                case 2:
                     if(boteLimon!=0){
                        System.out.println(stock);
                        boteLimon--;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 3:
                     if(boteNaranja!=0){
                        System.out.println(stock);
                        boteNaranja--;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 4:
                     if(boteTonica!=0){
                        System.out.println(stock);
                        boteTonica--;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 5:
                     if(boteAgua!=0){
                        System.out.println(stock);
                        boteAgua--;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 0:
                    
                    monedaIn = false;
                    break;
            }
                
             
        }while(monedaIn=true);
        
    }
    public boolean PulsarBoton(){
        System.out.println("Botes de Cola: "+boteCola);
        System.out.println("Botes de Limon: "+boteLimon);
        System.out.println("Botes de Naranja: "+boteNaranja);
        System.out.println("Botes de Tonica: "+boteTonica);
        System.out.println("Botes de Agua: "+boteAgua);
    }
    
    
}
