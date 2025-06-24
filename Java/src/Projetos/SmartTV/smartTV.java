package Projetos.SmartTV;

/**
* @author Henry Gabriel
* @version 1.0
* @since 24/06/2025
*/


public class smartTV {

     /**
     *@param numeroCanal este é o parâmetro do método escolherCanal
     *@return int este método retorna o parâmetro armazenado na variável
     */
        

    boolean ligada = true;
    int canal = 54;
    int volume = 12;

   public void aumentarVolume()
    {
        volume++;
    }

    public void diminuirVolume()
    {
        volume--;
    }

    public void desligarTV()
    {
        ligada = false;
    }

    
    public void ligarTV()
    {
        ligada = true;
    }

    public void subirCanal()
    {
        canal++;
    }
    
    public void descerCanal()
    {
        canal--;
    }

    public int escolherCanal(int numeroCanal)
    {
        canal = numeroCanal;
        return canal;
    }
}
