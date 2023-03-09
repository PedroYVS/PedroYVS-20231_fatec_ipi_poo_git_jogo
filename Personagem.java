//Em Java chama-se método em vez de função. Métodos possuem tipo de retorno, nome de chamada,...
//... conjunto de parâmetros e corpo.

public class Personagem{
    //Isso é uma variável de instância.
    String nome;
    int energia;
    int fome;
    int sono;

    //Isso é um método de instância.
    void cacar(){
        System.out.println(nome + " cacando");
    }

    void comer(){
        System.out.print(nome + " comendo\n");
    }

    void dormir(){
        //"%n" é o pula linha para qualquer SO que for (Linux, Windows etc.).
        System.out.printf("%s dormindo%n", nome);
    }
}