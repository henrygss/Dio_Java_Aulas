package Projetos.SmartTV;

public class usuario
{
    public static void main(String [] args)
    {
        smartTV smartTv = new smartTV();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.subirCanal();
        smartTv.subirCanal();
        System.out.println(smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.desligarTV();
        System.out.println(smartTv.ligada);
        
        smartTv.ligarTV();
        System.out.println(smartTv.ligada);

        smartTv.escolherCanal(10);
        System.out.println(smartTv.canal);

        smartTv.subirCanal();
        System.out.println(smartTv.canal);

        smartTv.escolherCanal(23);
        System.out.println(smartTv.canal);

    }
}