package maquinabebidas;

/**
 *
 * @author claza 8997
 */
public class MaquinaDeBebidas 
{
    
    private ContadorDeMonedas contador; //Contador de monedas de la maquina 
    private DispensadorDeBotes cola, limon, naranja, tonica, agua; //Cinco dispensadores de botes 
    private float precio;//Precio de las bebidas(común para todas) 
    
    /* Inicializa la maquina y todos los elementos asociados */ 
    /* Entradas: float m, cantidad inicial de monedas para el cambio */ 
    /* int b, cantidad inicial de botes en los dispensadores */ 
    /* float pvp, precio de las bebidas */ 
    /* Salidas: Ninguna */  
    public void IniciarMaquinaDeBebidas (float m, int b, float pvp)
    {
	contador=new ContadorDeMonedas(); 
	cola=new DispensadorDeBotes(); 
	limon=new DispensadorDeBotes(); 
	naranja=new DispensadorDeBotes(); 
	tonica=new DispensadorDeBotes(); 
	agua=new DispensadorDeBotes(); 
	contador.IniciarContadorDeMonedas(m); 
	cola.IniciarDispensadorDeBotes(b); 
	limon.IniciarDispensadorDeBotes(b); 
	naranja.IniciarDispensadorDeBotes(b); 
	tonica.IniciarDispensadorDeBotes(b); 
	agua.IniciarDispensadorDeBotes(b); 
	precio=pvp;         
    }
    
    /* Responder a una acción del usuario. Discrimina el tipo de accion */ 
    /* y utiliza las operaciones privadas */ 
    /* Entradas: char o, la orden del usuario */ 
    /* Salidas: Ninguna */ 
    public void DarOrden (char o)
    {
	switch(o)
	{ 
 		case 'A':case 'B':case 'C':case 'D':case 'E':case 'R':   OrdenMonedas(o);  break; 
		case '1':case '2':case '3':case '4':case '5': OrdenSeleccion(o); break;  case 'f': break;                
	}         
    }
    
    /* Visualiza la informacion de interes sobre la maquina */
    /* Botes en cada dispensador, precio de las bebidas, saldo del cliente */
    /* Entradas: Ninguna */ 
    /* Salidas: Ninguna */ 
    public void VisualizarMaquina ()
    {
	System.out.println("Botes Disponibles: "); 
	System.out.println("    Cola: "+cola.BotesDisponibles()); 
	System.out.println("    Limon: "+limon.BotesDisponibles()); 
	System.out.println("    Naranja: "+naranja.BotesDisponibles()); 
	System.out.println("    Tonica: "+tonica.BotesDisponibles()); 
	System.out.println("    Agua: "+agua.BotesDisponibles()); 
	System.out.println("Precio de las bebidas: "+precio); 
	System.out.println("Saldo actual: "+contador.Saldo());         
    }
    /* Realiza las acciones relacionadas con la introducción de monedas */
    /* Entradas: char o, la orden del usuario */ 
    /* Salidas: Ninguna */     
    private void OrdenMonedas (char o)
    {
	switch(o)
	{ 
	case 'A': contador.InsertarMoneda(0.05f); break; 
	case 'B': contador.InsertarMoneda(0.1f);  break;
	case 'C': contador.InsertarMoneda(0.2f);  break;  
	case 'D': contador.InsertarMoneda(0.5f);  break; 
	case 'E': contador.InsertarMoneda(1); 	  break;  
	case 'R': contador.Retornar();		  break;                 
	}         
    }
    /* Realiza las acciones relacionadas con la selección de una bebida */
    /* Entradas: char o, la orden del usuario */
    /* Salidas: Ninguna */ 
    private void OrdenSeleccion (char o)
    {
        if(contador.Saldo() >= precio)
        {
            switch(o)
            { 
                    case '1':  cola.PulsarBoton();   contador.DarCambioDe(precio); break; 
                    case '2': limon.PulsarBoton();   contador.DarCambioDe(precio); break; 
                    case '3': naranja.PulsarBoton(); contador.DarCambioDe(precio); break; 
                    case '4': tonica.PulsarBoton();  contador.DarCambioDe(precio); break; 
                    case '5': agua.PulsarBoton();    contador.DarCambioDe(precio); break;                 
           }
        }
    }

    
    
    
}
