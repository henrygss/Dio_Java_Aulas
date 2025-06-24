package Aulas;
public class MinhaClasse {
    public static void main(String [] args)
    {
        String primeiroNome = "Henry";
        String segundoNome = "Gabriel";

        String nomeCompleto = retornarNome(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    //Declarando um método
    public static String retornarNome(String primeiroNome, String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}