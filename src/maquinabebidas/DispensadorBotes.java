

import java.util.*;

public class DispensadorBotes {

    private int boteCola;
    private int boteLimon;
    private int boteNaranja;
    private int boteTonica;
    private int boteAgua;
    
    public void IniciarDispensadorBotes (int i){
      boteCola=i;
      boteLimon=i;
      boteNaranja=i;
      boteTonica=i;
      boteAgua=i;  
    }
      
    public boolean PulsarBoton (){
        
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
                        return stock;
                    }else{
                        stock=false;
                        System.out.println(stock);//no me deja  poner otra vez return stock, si lo hago da error el break
                    }
                    break;
                    
                case 2:
                    if(boteLimon!=0){
                        return stock;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 3:
                     if(boteNaranja!=0){
                        return stock;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 4:
                     if(boteTonica!=0){
                        return stock;
                    }else{
                        stock=false;
                        System.out.println(stock);
                    }
                    break;
                case 5:
                     if(boteAgua!=0){
                        return stock;

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
        return false;
        
    }
   
    public int BotesDiponibles (){
        Scanner tec=new Scanner(System.in);
        int opcion;
        boolean monedaIn = true;
        int nuevostock=0;
        do{
            /*System.out.println("1- Cola");
            System.out.println("2- Limon");
            System.out.println("3- Naranja");
            System.out.println("4- Tonica");
            System.out.println("5- Agua");
            System.out.println("0- ");*/
            opcion=tec.nextInt();
            switch(opcion){
                case 1:
                    boteCola--;
                    nuevostock=boteCola;
                    break;
                    
                case 2:
                    boteLimon--;
                    nuevostock=boteLimon;
                    break;
                    
                case 3:
                    boteNaranja--;
                    nuevostock=boteNaranja;
                    break;
                case 4:
                    boteTonica--;
                    nuevostock=boteTonica;
                    break;
                    
                case 5:
                     boteAgua--;
                     nuevostock=boteAgua;
                    break;
                    
                case 0:
                    monedaIn = false;
                    break;
            
            }
             
        }while(monedaIn=true);
        return nuevostock;
      
    }
    
}
