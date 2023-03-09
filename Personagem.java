//Em Java chama-se método em vez de função. Métodos possuem tipo de retorno, nome de chamada,...
//... conjunto de parâmetros e corpo.

import static java.lang.Math.min;

public class Personagem{
    //Isso é uma variável de instância.
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    //Isso é um método de instância.
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1, 10);
        sono = min(sono + 1, 10);
    }

    void comer(){
        if (fome >= 1){
            System.out.println(nome + " comendo");
            energia = min(energia +1, 10);
            fome--;
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }

    void dormir(){
        if (sono >= 1){
            //"%n" é o pula linha para qualquer SO que for (Linux, Windows etc.).
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10;
            sono--;
        }
        else{
            System.out.println(nome + " sem sono");
        }
    }
}