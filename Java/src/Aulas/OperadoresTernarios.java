package Aulas;
public class OperadoresTernarios {
    public static void main(String [] args)
    {
        int a, b;
        a = 10;
        b = 30;
        boolean resultado;

        /*Condicionando utilizando if else:
        if (a == b)
        {
            resultado = true;
            System.out.println(resultado);
        }
        else
        {
            resultado = false;
            System.out.println(resultado);
        }*/

        //condicionando com operador ternário
        resultado = (a == b) ?  true : false;
        System.out.println(resultado);

        //Utilizando condição com int
        int resultado2;

        resultado2 = (a == b) ? 1 : 0;
        System.out.println(resultado2);

    } 
}
