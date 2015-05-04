/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinabebidas;

/**
 *
 * @author 
 */
public class DispensadorDeBotes {

    private int botes; //Numero actual de botes.
    
    /* Inicializa el dispensador y pone i botes en Ã©l*/
    /* Entrada: int i, numero de botes en el dispensador*/
    /* Salidas: Ninguna */

    public void IniciarDispensadorDeBotes(int i) {
       botes = i;
    }
    /* Intenta dar un bote, devuelve true si es posible y falso
     si no hay
     botes */
    /* Entrada: Ninguna */
    /* Salidas: bool, true si entrega el bote */

    public boolean PulsarBoton() {
        boolean correcto=false;
        if (botes > 0) {
            botes-=1;
            correcto=true;
        }  
        return correcto;

    }
    /*Muestra el numero de botes disponibles en el
     dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int, el numero de botes */

    public int BotesDisponibles() {
        return botes;
    }
}
